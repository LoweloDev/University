# Title     : TODO
# Objective : TODO
# Created by: tobia
# Created on: 4/15/2021

Wf<-c("alleine", "alleine aber zu zweit", "Eltern")
Ge<-c("m","w","mentally ill")
monMiete<-c(6.50, 6.66, 350)
entf<-c(1.5, 2.5, 3.141592653589793238)
leistung<-c("unbefriedigend", "selbstbefriedigend", "streber")

Extmatrikulationsanwaerter <- data.frame(Wohnform = Wf, Geschlecht = Ge, Miete = monMiete, EntfFH = entf, Selbsteinschaetzung = leistung)

Extmatrikulationsanwaerter[Extmatrikulationsanwaerter$Geschlecht == "m",]

subset(Extmatrikulationsanwaerter, Geschlecht="m")
subset(Extmatrikulationsanwaerter, Geschlecht = "w")
subset(Extmatrikulationsanwaerter, Miete < 350)

seq<-c(seq(8,2, by=-2))
vektor<-(rep(seq, times=3))

vektor

bitterunden1 <- 0.59487387
bitterunden2 <- seq(1,2,length=4)

round(bitterunden1, digits=2)
round(bitterunden2, digits=2)