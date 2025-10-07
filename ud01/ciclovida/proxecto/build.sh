#!/bin/bash
# Compila o proxecto
kotlinc src -include-runtime -d calculadora.jar
# Executa o programa
java -jar calculadora.jar