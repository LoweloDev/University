echo Dateiinformationen gespeichert in:
realpath /home/lowelodev/IdeaProjects/University/Semester2/RechnerstrukturenUndBetriebssysteme2/rub2-praktikum02/dateiinfo.txt

for file in /home/*/*
do
  cmake-build-debug/rub2_praktikum02 $file | tee -a dateiinfo.txt
done


