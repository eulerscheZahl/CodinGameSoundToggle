This is a demonstration of how to turn the sound on and off at a CodinGame replay.

After importing the modules, the only changes worth mentioning are:

Register the sound toggle in the [Referee](https://github.com/eulerscheZahl/CodinGameSoundToggle/blob/master/src/main/java/com/codingame/game/Referee.java#L31).

Load the toggle in the [AnimatedEventModule](https://github.com/eulerscheZahl/CodinGameSoundToggle/blob/master/src/main/resources/view/animations/AnimatedEventModule.js#L87)

Query the toggle state in the [AnimatedEventModule](https://github.com/eulerscheZahl/CodinGameSoundToggle/blob/master/src/main/resources/view/animations/AnimatedEventModule.js#L95)



You can see the working demonstration on [CodinGame](https://www.codingame.com/contribute/view/45741fc2054c24a43cb6b8f2e9511fb34141).
