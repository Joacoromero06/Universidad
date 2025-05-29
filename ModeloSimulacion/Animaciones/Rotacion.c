#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include <unistd.h>
#define ANCHO 30
#define ALTO 30

//PANTALLA
typedef char Tpantalla[ALTO][ANCHO];
typedef struct {
    float x,y;
}punto;
typedef punto Tcuadrado[4];
void LimpiaPantalla(Tpantalla);
void MuestraPantalla(Tpantalla);
void DibujaCuadrado(Tpantalla,Tcuadrado);
int CoordX_IndMat(float);
int CoordY_IndMat(float);


//CUADRADO

void RotaCuadrado(Tcuadrado,float);
void CreaCuadrado(Tcuadrado);
void RotaVector(punto*,float);

//MAIN
int main(void){
    Tpantalla miframe;
    Tcuadrado micuadrado;
    CreaCuadrado(micuadrado);
    float angulo=0;
    int c=0;
    while(c<100){
        LimpiaPantalla(miframe);
        DibujaCuadrado(miframe,micuadrado);
        angulo+=25;
        RotaCuadrado(micuadrado,angulo);
        MuestraPantalla(miframe);
        usleep(100000); // 100ms
        system("cls"); // o system("cls") en Windows
        c++;
    }
    

    return 0;
}

void LimpiaPantalla(Tpantalla frame){
    int i,j;
    for(i=0;i<ALTO;i++)
        for(j=0;j<ANCHO;j++)
            frame[i][j]=' ';
}
void MuestraPantalla(Tpantalla frame){
    int i,j;
    for(i=0;i<ALTO;i++){
        for(j=0;j<ANCHO;j++)
            printf("%c",frame[i][j]);
        printf("\n");
    }        
}
void DibujaCuadrado(Tpantalla frame,Tcuadrado cuadrado){
    int i=0;
    int x,y;
    for(i;i<=3;i++){
        x=CoordX_IndMat(cuadrado[i].x);
        y=CoordY_IndMat(cuadrado[i].y);
        frame[y][x]='*';
    }
}
int CoordX_IndMat(float x){
    return (int)round(x + ANCHO / 2);
}
int CoordY_IndMat(float y){
    return (int)round(y + ALTO / 2);
}


void CreaCuadrado(Tcuadrado cuadrado){
    punto vert1,vert2,vert3,vert4;
    
    vert1.x=6;vert1.y=6;
    vert2.x=-6;vert2.y=6;
    vert3.x=-6;vert3.y=-6;
    vert4.x=6;vert4.y=-6;

    cuadrado[0]=vert1;
    cuadrado[1]=vert2;
    cuadrado[2]=vert3;
    cuadrado[3]=vert4;
}
void RotaCuadrado(Tcuadrado cuadrado,float angulo){
    RotaVector(&cuadrado[0],angulo);
    RotaVector(&cuadrado[1],angulo);
    RotaVector(&cuadrado[2],angulo);
    RotaVector(&cuadrado[3],angulo);
}
void RotaVector(punto* vec, float angulo){
    float x = vec->x;
    float y = vec->y;
    vec->x = x * cos(angulo) - y * sin(angulo);
    vec->y = x * sin(angulo) + y * cos(angulo);
}
