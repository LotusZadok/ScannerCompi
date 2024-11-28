section .data
x dw 0
y dw 0
c dw 0
b dw 0
a dw 0
tempLabel_3 dw 0
tempLabel_6 dw 0
section .code
mov ax, 4
mov bx, [x]
cmp ax, bx
jle ELSELabel_1
mov ax, [x]
mov bx, 2
sub ax, bx
mov [tempLabel_3], ax
mov ax, tempLabel_3
mov [x], ax
jmp EXITIFLabel_2
ELSELabel_1:
mov ax, [x]
dec ax
mov [x], ax

EXITIFLabel_2:
STARTWHILELabel_5:
mov ax, [x]
cmp ax, 10
jne EXITWHILELabel_4
mov ax, [x]
mov bx, 20
add ax, bx
mov [tempLabel_6], ax
mov ax, tempLabel_6
mov [y], ax
mov ax, [x]
inc ax
mov [x], ax

jmp STARTWHILELabel_5
EXITWHILELabel_4:
