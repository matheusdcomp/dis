#include<stdio.h>
#include<string.h>

void main() {

    char str[50];
    printf("Digite uma palavra: ");
    scanf("%s", str);

    int r = 1, i = 0, t = strlen(str) - 1;
        
    while (i <= t) {
        if (str[i] != str[t]) {
            r = 0;
            break;
        }
        i++;
        t--;
    } 

    printf("%s %seh palindromo.\n", str, r ? "" : "nao "); 
        
    
}