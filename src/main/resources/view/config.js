import { GraphicEntityModule } from './entity-module/GraphicEntityModule.js';
import { AnimatedEventModule } from './animations/AnimatedEventModule.js';
import { ToggleModule } from './toggle-module/ToggleModule.js'

// List of viewer modules that you want to use in your game
export const modules = [
	GraphicEntityModule,
	ToggleModule,
	AnimatedEventModule,
];

// The list of toggles displayed in the options of the viewer
export const options = [
  ToggleModule.defineToggle({
    // The name of the toggle
    // replace "myToggle" by the name of the toggle you want to use
    toggle: 'soundToggle',
    // The text displayed over the toggle
    title: 'SOUND TOGGLE',
    // The labels for the on/off states of your toggle
    values: {
      'SOUND ON': true,
      'SOUND OFF': false
    },
    // Default value of your toggle
    default: true
  }),
]