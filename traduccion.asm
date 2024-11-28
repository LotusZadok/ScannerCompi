section .data
x dw 0
y dw 0
c dw 0
b dw 0
a dw 0
u dw 0
h dw 0
section .code
mov ax, 4
mov bx, [x]
cmp ax, bx
jle ELSELabel_1
mov ax, 0
mov [x], ax
jmp EXITIFLabel_2
ELSELabel_1:
mov ax, [y]
dec ax
mov [y], ax

EXITIFLabel_2:
STARTWHILELabel_4:
mov ax, [x]
cmp ax, 10
jne EXITWHILELabel_3
mov ax, 5
mov [y], ax
mov ax, [x]
inc ax
mov [x], ax

jmp STARTWHILELabel_4
EXITWHILELabel_3:
