package com.kushan.freetts;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TextToSpeech {

	// Voice Name There are few more voice are available (ie: kevin, kevin16, alan)
	private static final String VOICE_NAME = "kevin16";
	private final Voice voice;
	
	public TextToSpeech() {

		VoiceManager voiceManager = VoiceManager.getInstance();		
		voice = voiceManager.getVoice(VOICE_NAME);
		voice.allocate();
	}

	public void speak(String text) {

		if(text != null && !text.isEmpty()) {
			
			voice.speak(text);
		}
	}

}

