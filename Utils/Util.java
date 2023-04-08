package kr.hs.namyangju.jv.util;
import androidx.appcompat.app.AppCompatActivity;

import kr.hs.namyangju.jv.dto.IntegratedDTO;

public class Util {
    AppCompatActivity appCompatActivity;
    public Util() {}
    public Util(AppCompatActivity appCompatActivity) {
        this.appCompatActivity = appCompatActivity;
    }
    public PopUp onPopup = new PopUp();
    public Tools tools = new Tools();
    public DebugLog debugLog = new DebugLog();
}
