#include <stdio.h>
#include <string.h>

#define SEARCH_BUFFER_SIZE 6
#define LOOKAHEAD_BUFFER_SIZE 4

typedef struct {
    int offset;
    int length;
    char next_char;
} LZ77Tuple;

void lz77_compress(const char *text, LZ77Tuple *compressed_output, int *output_size) {
    int pos = 0;
    int text_length = strlen(text);
    *output_size = 0;

    while (pos < text_length) {
        int match_length = 0;
        int match_offset = 0;
        char next_character = text[pos];

        // Set the start of the search buffer
        int start_index = (pos - SEARCH_BUFFER_SIZE > 0) ? pos - SEARCH_BUFFER_SIZE : 0;

        // Find the longest match within the search buffer
        for (int offset = start_index; offset < pos; offset++) {
            int length = 0;
            
            // Check for match within the lookahead buffer limit
            while (length < LOOKAHEAD_BUFFER_SIZE && pos + length < text_length &&
                   text[offset + length] == text[pos + length]) {
                length++;
            }
            
            // Update the longest match found
            if (length > match_length) {
                match_length = length;
                match_offset = pos - offset;
            }
        }

        // If a match was found, set the next character after the match
        if (match_length > 0) {
            next_character = text[pos + match_length];
        }

        // Store the (offset, length, next_character) in the output
        compressed_output[*output_size].offset = match_offset;
        compressed_output[*output_size].length = match_length;
        compressed_output[*output_size].next_char = next_character;
        (*output_size)++;

        // Move the position forward by the length of the match + 1
        pos += match_length + 1;
    }
}

void print_compressed_output(LZ77Tuple *compressed_output, int output_size) {
    printf("Compressed Output:\n");
    for (int i = 0; i < output_size; i++) {
        printf("(%d, %d, %c)\n", compressed_output[i].offset, compressed_output[i].length, compressed_output[i].next_char);
    }
}
