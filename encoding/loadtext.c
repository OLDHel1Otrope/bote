#include <stdio.h>
#include <stdlib.h>

char* textBlock(char filename[], int chunkSize, int blockNumber) {
    FILE *file = fopen(filename, "rb");
    if (file == NULL) {
        perror("Error opening file");
        return NULL;
    }

    int startPos = chunkSize * blockNumber;

    if (fseek(file, startPos, SEEK_SET) != 0) {
        fclose(file);
        return NULL;
    }

    char *buffer = (char *)malloc(chunkSize + 1);
    if (buffer == NULL) {
        fclose(file);
        return NULL;
    }

    size_t bytesRead = fread(buffer, 1, chunkSize, file);
    if (bytesRead == 0) {
        free(buffer);
        fclose(file);
        return NULL;
    }

    buffer[bytesRead] = '\0';

    fclose(file);
    return buffer;
}
