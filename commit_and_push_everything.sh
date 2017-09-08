#!/bin/bash

d=$(date +%Y-%m-%d)

#add classes here
git add $0;
git add COO/*.mdown SIMULATION\ DE\ GESTION/*.mdown;

#crtl c ctrl v for pdf
git add COO/*.pdf SIMULATION\ DE\ GESTION/*.pdf;


echo "Update classes :";

git status;
git commit -m "update classes  $d";
git push -u origin master;

echo "done";