section .data
y dw 0
x dw 0
z dw 0
a dw 0
c dw 0
b dw 0
tempLabel_1 dw 0
section .code
mov ax, [z]
mov bx, 2
add ax, bx
mov [tempLabel_1], ax
mov ax, tempLabel_1
mov [y], ax
