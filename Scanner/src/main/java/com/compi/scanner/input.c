 int x,y;
 int x;  // Variable doblemente definida
 
void main(){
 y= z + 2; // z Variable no definida;
 break; //break fuera de lugar
}

int funcion (int a) { 
 int a, b, c;  // doblemente definida para la funcion
 int y;   

 y= z + 2; // z Variable no definida;

}