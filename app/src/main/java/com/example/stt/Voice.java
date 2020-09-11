package com.example.stt;

import android.content.Context;
import android.content.Intent;
import android.speech.SpeechRecognizer;
import android.speech.tts.TextToSpeech;

public class Voice {
    private Context cThis;//context 설정
    private String LogTT="[STT]";//LOG타이틀
    //음성 인식용
    Intent SttIntent;
    SpeechRecognizer mRecognizer;
    //음성 출력용
    TextToSpeech tts;

}
