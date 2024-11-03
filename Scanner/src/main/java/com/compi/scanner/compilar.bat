@echo off
REM Ejecuta CUP para generar el archivo Sintax.java y sym.java desde Sintax.cup
java -jar java-cup-11b.jar -parser Sintax -symbols sym Sintax.cup