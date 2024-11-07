const int a;    // error: debe inicializar la constante
int g;
y;      // error: no especifica tipo 
int z, t, y, y;

int h   // error: falta punto y coma
const char b = lqs;

int funcion1(){  
int k;  
int g  //error por no tener ;

a = a * c;
a = a * funcion(8);

	if (y>=0) {
		x= a+b; 
	}
	else { 
		x= a+b;
	} 
	else {
		x--;
	}
        

	if x==3 {//deberia dar error por expresion fuera de parentesis
		x= a+b;
	} 
	else {
		x--;
	} 
}


int funcion4(int, int) { //no se permite solo los tipos
	
	if ( (x<7) && (x>2) ){
 		x= g+6;
	}
	
	while ( ){ //debe dar error porque falta expresion
		x= a+b; 	
		break;
	}
	
	for (x=0; ) { //error pues hay solamente una expresion 
		x= a+b; 	
		break;
	}
}

int funcion1( int x )  {  

	while (x && y){ 
		x++;
 	}
	
	switch(2) {            
		case 1: x=1; break;
		case 2: x=2; break;
		default: x=0; break;
 	}

read(uud);  
read(123);  //se espera error, pues no se acepta expresion entre ( )
read(); //se espera error

write(C - 123);
write( );    //se espera error

}  