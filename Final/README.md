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
 * Chords are saved and exported as text files
 * Can list all saved chords in a single command ( UNIX, not avaiable for DOS-based systems )
 * Simple yet effective command line arguments:
   * -h Show help
   * -l List saved chords
   * -n Create new chord. Follow '-n' with name of chord, for example: 
```
$ java ChordED -n Em
```

### Notes
 * To make a string muted, insert any fret number higher than 9. ( Kept fret count to 9 to simplify formatting ).
 * All chords inputted are automatically saved in chords/ folder as .txt files, thus they are very simple to edit and modify
