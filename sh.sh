#!/bin/bash

for i in {1..20}
    do  docker run --name examen$i -d --rm -p 80$i:80 examen:v6
done
