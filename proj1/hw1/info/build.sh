#!/bin/tcsh

enscript -B -p - Minijava.txt | ps2pdf - hw1a.pdf
enscript -p - ../grammar | ps2pdf - hw1b.pdf
enscript -p - ../Makefile1 | ps2pdf - hw1c.pdf
enscript -p - ../minijava/Main1.java | ps2pdf - hw1d.pdf

gs -q -dNOPAUSE -dBATCH -sDEVICE=pdfwrite -sOutputFile=hw1Full.pdf hw1.pdf hw1a.pdf hw1b.pdf hw1c.pdf hw1d.pdf
