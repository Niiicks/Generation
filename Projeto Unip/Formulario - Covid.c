#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <ctype.h>


int cadastro(){


char nome [255];
int cpf ;
int telefone;
char endereco [50];
int numero;
char bairro [50];
char cidade [50];
char estado [50];
char cep[10];
int diaN, mesN, anoN;
char email [50];
char diagnostico;
char comorbidade;
int idade;
char doencas[255];
int anoatual = 2020;


FILE *Ponteiro;


printf("Insira nome: ");
fflush(stdin);
scanf("%s", &nome);

printf("\nInsira cpf: ");
fflush(stdin);
scanf("%d", &cpf);

printf("\nInsira telefone: ");
fflush(stdin);
scanf("%d", &telefone);

printf("\nInsira endereco: ");
fflush(stdin);
scanf("%s", &endereco);

printf("\nInsira numero: ");
fflush(stdin);
scanf("%d", &numero);

printf("\nInsira bairro: ");
fflush(stdin);
scanf("%s", &bairro);

printf("\nInsira cidade: ");
fflush(stdin);
scanf("%s", &cidade);

printf("\nInsira estado: ");
fflush(stdin);
scanf("%s", &estado);

printf("\nInsira cep: ");
fflush(stdin);
scanf("%s", &cep);

printf("\nInsira a data de nascimento(dd/mm/aaaa): ");
fflush(stdin);
scanf("%d/%d/%d", &diaN, &mesN, &anoN);

printf("\nInsira email: ");
fflush(stdin);
scanf("%s", &email);

printf("\nInsira data diagnostico: ");
fflush(stdin);
scanf("%s", &diagnostico);



printf("\nAlguma comorbidade? \t [S / N]");
fflush(stdin);
scanf("%c", &comorbidade);

if(toupper(comorbidade) == 'S'){

	printf("\nDigite as comorbidades: ");
	fflush(stdin);
	scanf("%s", &doencas);

}

idade = anoatual - anoN;
printf("\nidade: %d\n", idade);

if(idade >= 65 || toupper(comorbidade) == 'S' ){

Ponteiro = fopen("arquivo.txt", "a");

fprintf(Ponteiro,"Cep: %s | Idade: %d\n ------------------------------------\n", cep, idade);

fclose(Ponteiro);

	printf("Grupo de RISCO!!!");

}else {
	printf("Fora do grupo de Risco!");
}





}

int main(void){

setlocale(LC_ALL, "Portuguese");

int op;
char login[15];
char senha[7];
char aux;
char c;
int cont = 0;
int i;
int a;
int verifica_senha=0;

do{
i=0;
fflush(stdin);
system("cls");

printf("Digite o LOGIN\a: ");
fflush(stdin);
scanf("%s", login);

printf("Digite a SENHA: ");


    while((c=getch())!=13){

     senha[i]= c;

     putchar ('*');
     i++;
     }
     senha[i] = '\0';


if(strstr(login, "admin") != NULL && strstr(senha,"goiaba") != NULL ){
    printf("\nDADOS CORRETOS\n");system("color 0a");verifica_senha=1;Beep(1500,500);}
        else{printf("\n FALHA \n");system("color 0c");Beep(1200,200);}

cont++;
}while(verifica_senha==0 && cont < 3);

if(verifica_senha == 0){
    printf("Você excedeu o número de tentativas!");
    exit(0);
}
	do{

cadastro();

printf("\nInsira\n [1] Novo Cadastro \n [2] Sair: ");
fflush(stdin);
scanf("%d", &op);

	}while(op == 1);
}
