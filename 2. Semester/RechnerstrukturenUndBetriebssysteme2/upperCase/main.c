#include <stdio.h>
#include <string.h>
#include <ctype.h>

void to_upper_case(char in[], char out[])
 {
    for(int i = 0; i < strlen(in); i++) {
        out[i] = toupper(in[i]);
    }
 }

 int main()
 {
     char input[30] = "a-6430 ötztal-bahnhof";
     char output[30];

     printf("Original: %s\n", input);
     to_upper_case(input, output);

    printf("Umgewandelt: %s\n", output);
}

