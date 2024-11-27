x dd ?
y dd ?
a dd ?
b dd ?
c dd ?

mov ax, [x]
cmp ax, 4
jle exit_Label_0
mov ax, [x]
dec ax
mov [x], ax

mov ax, [x]
inc ax
mov [x], ax

