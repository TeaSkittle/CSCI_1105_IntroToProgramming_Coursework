# ChordED

ChordED is a CLI tool written in Java that is meant for creating and storing guitar chords. It is a combination of a guitar  
chord chart:    
![chart](chart.png)  
and guitar tablature:  
![tab](tab.png)  
Those two concepts combined creates this:  
```
	E  
   -----------------    
O || - - - - - - - ||  
O || - - - - - - - ||    
O || 1 - - - - - - ||  
- || - 2 - - - - - ||       
- || - 2 - - - - - ||  
O || - - - - - - - ||    
   -----------------
```
 ### Features
 * Can create custom chords
 * Store as many chords as the user wants
 * Chords are exported into their own text files
 * Simple yet effective command line arguments:
   * -h Show help
   * -l List saved chords
   * -n Create new chord Follow. '-n' with name of chord, for example: 
```
$ java ChordED -n Em
```
