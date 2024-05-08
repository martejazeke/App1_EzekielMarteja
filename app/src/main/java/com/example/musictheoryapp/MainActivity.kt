package com.example.musictheoryapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {

    val keylist= arrayOf("Key of A", "Key of A#", "Key of B", "Key of C", "Key of C#", "Key of D", "Key of D#", "Key of E", "Key of F", "Key of F#", "Key of G", "Key of G#")
    val scalelist = arrayOf("Major", "Natural Minor", "Harmonic Minor", "Melodic Minor")
    val calclist = arrayOf("Scale Notes", "Chord Progressions")

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Splash Screen
        Thread.sleep(2000) // Duration of the splash screen
        installSplashScreen()

        setContentView(R.layout.activity_main)

        // Creating adapters value for viewing purposes
        val adapter1 = ArrayAdapter(this, android.R.layout.simple_spinner_item, keylist)
        val adapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, scalelist)
        val adapter3 = ArrayAdapter(this, android.R.layout.simple_spinner_item, calclist)

        // Setting the adapters for viewing
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_item)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_item)
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_item)

        //Creating variables

        var b1 = findViewById<Button>(R.id.button)
        var key = findViewById<Spinner>(R.id.key_spinner)
        var scale = findViewById<Spinner>(R.id.scale_spinner)
        var calc = findViewById<Spinner>(R.id.calcspinner)
        var result = findViewById<TextView>(R.id.textView5)

        //Setting the key spinner
        key.adapter=adapter1
        key.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long)
            {
            }
        }

        //Setting the scale spinner
        scale.adapter=adapter2
        scale.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long)
            {
            }
        }

        //Setting the calculation spinner
        calc.adapter=adapter3
        calc.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long)
            {
            }
        }

        //Once the user clicks the button, displays the result.

        b1.setOnClickListener{
            //Key of A [0] Scales and Scale Notes
            if(key.selectedItemPosition == 0 && scale.selectedItemPosition == 0 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nA, B, C#, D, E, F#, G#, A")
            }
            if(key.selectedItemPosition == 0 && scale.selectedItemPosition == 1 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nA, B, C, D, E, F, G, A")
            }
            if(key.selectedItemPosition == 0 && scale.selectedItemPosition == 2 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nA, B, C, D, E, F, G#, A")
            }
            if(key.selectedItemPosition == 0 && scale.selectedItemPosition == 3 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nA, B, C, D, E, F#, G#, A (Ascending) \n A, G, F, E, D, C, B, A (Descending)")

            }


            //Key of A [0] Scales and Chord Progressions

            if(key.selectedItemPosition == 0 && scale.selectedItemPosition == 0 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \nI-IV-V: A major, D major, E major\n" +
                        "ii-V-I: B minor, E major, A major\n" +
                        "vi-IV-I-V: F# minor, D major, A major, E major")
            }
            if(key.selectedItemPosition == 0 && scale.selectedItemPosition == 1 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-iv-V: A minor, D minor, E major\n" +
                        "ii°-V-i: B diminished, E major, A minor\n" +
                        "III+-V-i: C augmented, E major, A minor")
            }
            if(key.selectedItemPosition == 0 && scale.selectedItemPosition == 2 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-iv-V: A minor, D minor, E major\n" +
                        "ii°-V-i: B diminished, E major, A minor\n" +
                        "III+-V-i: C augmented, E major, A minor")
            }
            if(key.selectedItemPosition == 0 && scale.selectedItemPosition == 3 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-IV-V: A minor, D major, E major\n" +
                        "ii°-V-i: B diminished, E major, A minor\n" +
                        "III-VI-i-V: C major, F# minor, A minor, E major")

            }

            //Key of A# [1] Scales and Scale Notes
            if(key.selectedItemPosition == 1 && scale.selectedItemPosition == 0 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nA#, C, D, D#, F, G, A, A#")
            }
            if(key.selectedItemPosition == 1 && scale.selectedItemPosition == 1 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nA#, C, C#, D#, F, F#, G#, A#")
            }
            if(key.selectedItemPosition == 1 && scale.selectedItemPosition == 2 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nA#, C, C#, D#, F, F#, G#, A#")
            }
            if(key.selectedItemPosition == 1 && scale.selectedItemPosition == 3 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nA#, C, D, D#, F, G, A, A# (Ascending) \n A#, G#, F#, E, D#, C#, C, A# (Descending)")

            }

            //Key of A# [1] Scales and Chord Progressions

            if(key.selectedItemPosition == 1 && scale.selectedItemPosition == 0 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \nI-IV-V: A# major, D# major, F major\n" +
                        "ii-V-I: B# minor, E# major, A# major\n" +
                        "vi-IV-I-V: F minor, D# major, A# major, E# major")
            }
            if(key.selectedItemPosition == 1 && scale.selectedItemPosition == 1 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-iv-V: A# minor, D# minor, F# major\n" +
                        "ii°-V-i: B# diminished, E# major, A# minor\n" +
                        "III+-V-i: C# augmented, E# major, A# minor")
            }
            if(key.selectedItemPosition == 1 && scale.selectedItemPosition == 2 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-iv-V: A# minor, D# minor, F# major\n" +
                        "ii°-V-i: B# diminished, E# major, A# minor\n" +
                        "III+-V-i: C# augmented, E# major, A# minor")
            }
            if(key.selectedItemPosition == 1 && scale.selectedItemPosition == 3 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-IV-V: A# minor, D# major, F major\n" +
                        "ii°-V-i: B# diminished, E# major, A# minor\n" +
                        "III-VI-i-V: C# major, F minor, A# minor, E# major")

            }

            //Key of B [2] Scales and Scale Notes
            if(key.selectedItemPosition == 2 && scale.selectedItemPosition == 0 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nB, C#, D#, E, F#, G#, A#, B")
            }
            if(key.selectedItemPosition == 2 && scale.selectedItemPosition == 1 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nB, C#, D, E, F#, G, A, B")
            }
            if(key.selectedItemPosition == 2 && scale.selectedItemPosition == 2 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nB, C#, D, E, F#, G, A#, B")
            }
            if(key.selectedItemPosition == 2 && scale.selectedItemPosition == 3 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nB, C#, D, E, F#, G#, A#, B (Ascending) \n B, A, G, F#, E, D, C#, B (Descending)")
            }

            //Key of B [2] Scales and Chord Progressions

            if(key.selectedItemPosition == 2 && scale.selectedItemPosition == 0 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \nI-IV-V: B major, E major, F# major\n" +
                        "ii-V-I: C# minor, F# major, B major\n" +
                        "vi-IV-I-V: G# minor, E major, B major, F# major")
            }
            if(key.selectedItemPosition == 2 && scale.selectedItemPosition == 1 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-iv-V: B minor, E minor, F# major\n" +
                        "ii°-V-i: C# diminished, F# major, B minor\n" +
                        "III+-V-i: D augmented, F# major, B minor")
            }
            if(key.selectedItemPosition == 2 && scale.selectedItemPosition == 2 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-iv-V: B minor, E minor, F# major\n" +
                        "ii°-V-i: C# diminished, F# major, B minor\n" +
                        "III+-V-i: D augmented, F# major, B minor")
            }
            if(key.selectedItemPosition == 2 && scale.selectedItemPosition == 3 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-IV-V: B minor, E major, F# major\n" +
                        "ii°-V-i: C# diminished, F# major, B minor\n" +
                        "III-VI-i-V: D major, G# minor, B minor, F# major")

            }

            //Key of C [3] Scales and Scale Notes
            if(key.selectedItemPosition == 3 && scale.selectedItemPosition == 0 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nC, D, E, F, G, A, B, C")
            }
            if(key.selectedItemPosition == 3 && scale.selectedItemPosition == 1 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nC, D, D#, F, G, G#, A#, C")
            }
            if(key.selectedItemPosition == 3 && scale.selectedItemPosition == 2 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nC, D, D#, F, G, G#, B, C")
            }
            if(key.selectedItemPosition == 3 && scale.selectedItemPosition == 3 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nC, D, D#, F, G, A, B, C (Ascending) \n  C, A#, G#, G, F, D#, D, C (Descending)")
            }

            //Key of C [3] Scales and Chord Progressions

            if(key.selectedItemPosition == 3 && scale.selectedItemPosition == 0 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \nI-IV-V: B major, E major, F# major\n" +
                        "ii-V-I: C# minor, F# major, B major\n" +
                        "vi-IV-I-V: G# minor, E major, B major, F# major")
            }
            if(key.selectedItemPosition == 3 && scale.selectedItemPosition == 1 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-iv-V: C minor, F minor, G major\n" +
                        "ii°-V-i: D diminished, G major, C minor\n" +
                        "III+-V-i: D# augmented, G major, C minor")
            }
            if(key.selectedItemPosition == 3 && scale.selectedItemPosition == 2 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-iv-V: C minor, F minor, G major\n" +
                        "ii°-V-i: D diminished, G major, C minor\n" +
                        "III+-V-i: D# augmented, G major, C minor")
            }
            if(key.selectedItemPosition == 3 && scale.selectedItemPosition == 3 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-IV-V: C minor, F major, G major\n" +
                        "ii°-V-i: D diminished, G major, C minor\n" +
                        "III-VI-i-V: D# major, A minor, C minor, G major")

            }

            //Key of C# [4] Scales and Scale Notes
            if(key.selectedItemPosition == 4 && scale.selectedItemPosition == 0 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nC#, D#, F, F#, G#, A#, C, C#")
            }
            if(key.selectedItemPosition == 4 && scale.selectedItemPosition == 1 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nC#, D#, E, F#, G#, A, B, C#")
            }
            if(key.selectedItemPosition == 4 && scale.selectedItemPosition == 2 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nC#, D#, E, F#, G#, A, B#, C#")
            }
            if(key.selectedItemPosition == 4 && scale.selectedItemPosition == 3 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nC#, D#, E, F#, G#, A#, B#, C# (Ascending) \n  C#, B, A, G#, F#, E, D#, C# (Descending)")
            }

            //Key of C# [4] Scales and Chord Progressions

            if(key.selectedItemPosition == 4 && scale.selectedItemPosition == 0 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \nI-IV-V: C# major, F# major, G# major\n" +
                        "ii-V-I: D# minor, G# major, C# major\n" +
                        "vi-IV-I-V: A# minor, F# major, C# major, G# major")
            }
            if(key.selectedItemPosition == 4 && scale.selectedItemPosition == 1 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-iv-V: C# minor, F# minor, G# major\n" +
                        "ii°-V-i: D# diminished, G# major, C# minor\n" +
                        "III+-V-i: E augmented, G# major, C# minor")
            }
            if(key.selectedItemPosition == 4 && scale.selectedItemPosition == 2 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-iv-V: C# minor, F# minor, G# major\n" +
                        "ii°-V-i: D# diminished, G# major, C# minor\n" +
                        "III+-V-i: E augmented, G# major, C# minor")
            }
            if(key.selectedItemPosition == 4 && scale.selectedItemPosition == 3 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-IV-V: C# minor, F# major, G# major\n" +
                        "ii°-V-i: D# diminished, G# major, C# minor\n" +
                        "III-VI-i-V: E major, A# minor, C# minor, G# major")

            }

            //Key of D [5] Scales and Scale Notes
            if(key.selectedItemPosition == 5 && scale.selectedItemPosition == 0 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nD, E, F#, G, A, B, C#, D")
            }
            if(key.selectedItemPosition == 5 && scale.selectedItemPosition == 1 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nD, E, F, G, A, A#, C, D")
            }
            if(key.selectedItemPosition == 5 && scale.selectedItemPosition == 2 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nD, E, F, G, A, A#, C#, D")
            }
            if(key.selectedItemPosition == 5 && scale.selectedItemPosition == 3 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nD, E, F, G, A, B, C#, D (Ascending) \n  D, C, A#, A, G, F, E, D (Descending)")
            }

            //Key of D [5] Scales and Chord Progressions

            if(key.selectedItemPosition == 5 && scale.selectedItemPosition == 0 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \nI-IV-V: D major, G major, A major\n" +
                        "ii-V-I: E minor, A major, D major\n" +
                        "vi-IV-I-V: B minor, G major, D major, A major")
            }
            if(key.selectedItemPosition == 5 && scale.selectedItemPosition == 1 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-iv-V: D minor, G minor, A major\n" +
                        "ii°-V-i: E diminished, A major, D minor\n" +
                        "III+-V-i: F augmented, A major, D minor")
            }
            if(key.selectedItemPosition == 5 && scale.selectedItemPosition == 2 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-iv-V: D minor, G minor, A major\n" +
                        "ii°-V-i: E diminished, A major, D minor\n" +
                        "III+-V-i: F augmented, A major, D minor")
            }
            if(key.selectedItemPosition == 5 && scale.selectedItemPosition == 3 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-IV-V: D minor, G major, A major\n" +
                        "ii°-V-i: E diminished, A major, D minor\n" +
                        "III-VI-i-V: F major, B minor, D minor, A major")

            }

            //Key of D# [6] Scales and Scale Notes
            if(key.selectedItemPosition == 6 && scale.selectedItemPosition == 0 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nD#, F, G, G#, A#, C, D, D#")
            }
            if(key.selectedItemPosition == 6 && scale.selectedItemPosition == 1 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nD#, F, F#, G#, A#, B, C#, D#")
            }
            if(key.selectedItemPosition == 6 && scale.selectedItemPosition == 2 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nD#, F, F#, G#, A#, B, D, D#")
            }
            if(key.selectedItemPosition == 6 && scale.selectedItemPosition == 3 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nD#, F, G, G#, A#, C, D, D# (Ascending) \n  D#, C#, B, A#, G#, F#, E, D# (Descending)")
            }

            //Key of D# [6] Scales and Chord Progressions

            if(key.selectedItemPosition == 6 && scale.selectedItemPosition == 0 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \nI-IV-V: D# major, G# major, A# major\n" +
                        "ii-V-I: F minor, A# major, D# major\n" +
                        "vi-IV-I-V: C minor, G# major, D# major, A# major")
            }
            if(key.selectedItemPosition == 6 && scale.selectedItemPosition == 1 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-iv-V: D# minor, G# minor, A# major\n" +
                        "ii°-V-i: F diminished, A# major, D# minor\n" +
                        "III+-V-i: F# augmented, A# major, D# minor")
            }
            if(key.selectedItemPosition == 6 && scale.selectedItemPosition == 2 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-iv-V: D# minor, G# minor, A# major\n" +
                        "ii°-V-i: F diminished, A# major, D# minor\n" +
                        "III+-V-i: F# augmented, A# major, D# minor")
            }
            if(key.selectedItemPosition == 6 && scale.selectedItemPosition == 3 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-IV-V: D# minor, G# major, A# major\n" +
                        "ii°-V-i: F diminished, A# major, D# minor\n" +
                        "III-VI-i-V: F# major, B# minor, D# minor, A# major")

            }

            //Key of E [7] Scales and Scale Notes
            if(key.selectedItemPosition == 7 && scale.selectedItemPosition == 0 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nE, F#, G#, A, B, C#, D#, E")
            }
            if(key.selectedItemPosition == 7 && scale.selectedItemPosition == 1 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nE, F#, G, A, B, C, D, E")
            }
            if(key.selectedItemPosition == 7 && scale.selectedItemPosition == 2 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nE, F#, G, A, B, C, D#, E")
            }
            if(key.selectedItemPosition == 7 && scale.selectedItemPosition == 3 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nE, F#, G, A, B, C#, D#, E (Ascending) \nE, D, C, B, A, G#, F#, E (Descending)")
            }

            //Key of E [7] Scales and Chord Progressions

            if(key.selectedItemPosition == 7 && scale.selectedItemPosition == 0 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \nI-IV-V: E major, A major, B major\n" +
                        "ii-V-I: F# minor, B major, E major\n" +
                        "vi-IV-I-V: C# minor, A major, E major, B major")
            }
            if(key.selectedItemPosition == 7 && scale.selectedItemPosition == 1 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-iv-V: E minor, A minor, B major\n" +
                        "ii°-V-i: F# diminished, B major, E minor\n" +
                        "III+-V-i: G augmented, B major, E minor")
            }
            if(key.selectedItemPosition == 7 && scale.selectedItemPosition == 2 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-iv-V: E minor, A minor, B major\n" +
                        "ii°-V-i: F# diminished, B major, E minor\n" +
                        "III+-V-i: G augmented, B major, E minor")
            }
            if(key.selectedItemPosition == 7 && scale.selectedItemPosition == 3 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-IV-V: E minor, A major, B major\n" +
                        "ii°-V-i: F# diminished, B major, E minor\n" +
                        "III-VI-i-V: G major, C# minor, E minor, B major")

            }

            //Key of F [8] Scales and Scale Notes
            if(key.selectedItemPosition == 8 && scale.selectedItemPosition == 0 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nF, G, A, B♭, C, D, E, F")
            }
            if(key.selectedItemPosition == 8 && scale.selectedItemPosition == 1 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nF, G, A♭, B♭, C, D♭, E♭, F")
            }
            if(key.selectedItemPosition == 8 && scale.selectedItemPosition == 2 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \n F, G, A♭, B♭, C, D♭, E, F")
            }
            if(key.selectedItemPosition == 8 && scale.selectedItemPosition == 3 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nF, G, A♭, B♭, C, D, E, F (Ascending) \nF, E♭, D♭, B♭, A♭, G, F (Descending)")
            }

            //Key of F [8] Scales and Chord Progressions

            if(key.selectedItemPosition == 8 && scale.selectedItemPosition == 0 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \nI-IV-V: F major, B♭ major, C major\n" +
                        "ii-V-I: G minor, C major, F major\n" +
                        "vi-IV-I-V: D minor, B♭ major, F major, C major")
            }
            if(key.selectedItemPosition == 8 && scale.selectedItemPosition == 1 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-iv-V: F minor, B♭ minor, C major\n" +
                        "ii°-V-i: G diminished, C major, F minor\n" +
                        "III+-V-i: A♭ augmented, C major, F minor")
            }
            if(key.selectedItemPosition == 8 && scale.selectedItemPosition == 2 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-iv-V: F minor, B♭ minor, C major\n" +
                        "ii°-V-i: G diminished, C major, F minor\n" +
                        "III+-V-i: A♭ augmented, C major, F minor")
            }
            if(key.selectedItemPosition == 8 && scale.selectedItemPosition == 3 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-IV-V: F minor, B♭ major, C major\n" +
                        "ii°-V-i: G diminished, C major, F minor\n" +
                        "III-VI-i-V: A♭ major, D minor, F minor, C major")

            }

            //Key of F# [9] Scales and Scale Notes
            if(key.selectedItemPosition == 9 && scale.selectedItemPosition == 0 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nF#, G#, A#, B, C#, D#, F, F#")
            }
            if(key.selectedItemPosition == 9 && scale.selectedItemPosition == 1 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nF#, G#, A, B, C#, D, E, F#")
            }
            if(key.selectedItemPosition == 9 && scale.selectedItemPosition == 2 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nF#, G#, A, B, C#, D, E#, F#")
            }
            if(key.selectedItemPosition == 9 && scale.selectedItemPosition == 3 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nF#, G#, A, B, C#, D#, F, F# (Ascending) \nF#, E, D, B, A, G#, F# (Descending)")
            }

            //Key of F# [9] Scales and Chord Progressions

            if(key.selectedItemPosition == 9 && scale.selectedItemPosition == 0 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \nI-IV-V: F# major, B major, C# major\n" +
                        "ii-V-I: G# minor, C# major, F# major\n" +
                        "vi-IV-I-V: D# minor, B major, F# major, C# major")
            }
            if(key.selectedItemPosition == 9 && scale.selectedItemPosition == 1 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-iv-V: F# minor, B minor, C# major\n" +
                        "ii°-V-i: G# diminished, C# major, F# minor\n" +
                        "III+-V-i: A augmented, C# major, F# minor")
            }
            if(key.selectedItemPosition == 9 && scale.selectedItemPosition == 2 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-iv-V: F# minor, B minor, C# major\n" +
                        "ii°-V-i: G# diminished, C# major, F# minor\n" +
                        "III+-V-i: A augmented, C# major, F# minor")
            }
            if(key.selectedItemPosition == 9 && scale.selectedItemPosition == 3 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-IV-V: F# minor, B major, C# major\n" +
                        "ii°-V-i: G# diminished, C# major, F# minor\n" +
                        "III-VI-i-V: A major, D# minor, F# minor, C# major")

            }

            //Key of G [10] Scales and Scale Notes
            if(key.selectedItemPosition == 10 && scale.selectedItemPosition == 0 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nG, A, B, C, D, E, F#, G")
            }
            if(key.selectedItemPosition == 10 && scale.selectedItemPosition == 1 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nG, A, B♭, C, D, E♭, F, G")
            }
            if(key.selectedItemPosition == 10 && scale.selectedItemPosition == 2 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nG, A, B♭, C, D, E♭, F#, G")
            }
            if(key.selectedItemPosition == 10 && scale.selectedItemPosition == 3 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nG, A, B♭, C, D, E, F#, G (Ascending) \nG, F, E♭, D, C, B♭, A, G (Descending)")
            }

            //Key of G [10] Scales and Chord Progressions

            if(key.selectedItemPosition == 10 && scale.selectedItemPosition == 0 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \nI-IV-V: G major, C major, D major\n" +
                        "ii-V-I: A minor, D major, G major\n" +
                        "vi-IV-I-V: E minor, C major, G major, D major")
            }
            if(key.selectedItemPosition == 10 && scale.selectedItemPosition == 1 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \nii-iv-V: G minor, C minor, D major\n" +
                        "ii°-V-i: A diminished, D major, G minor\n" +
                        "III+-V-i: B♭ augmented, D major, G minor")
            }
            if(key.selectedItemPosition == 10 && scale.selectedItemPosition == 2 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-iv-V: G minor, C minor, D major\n" +
                        "ii°-V-i: A diminished, D major, G minor\n" +
                        "III+-V-i: B♭ augmented, D major, G minor")
            }
            if(key.selectedItemPosition == 10 && scale.selectedItemPosition == 3 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-IV-V: G minor, C major, D major\n" +
                        "ii°-V-i: A diminished, D major, G minor\n" +
                        "III-VI-i-V: B♭ major, E minor, G minor, D major")

            }

            //Key of G# [11] Scales and Scale Notes
            if(key.selectedItemPosition == 11 && scale.selectedItemPosition == 0 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nG#, A#, C, C#, D#, F, G, G#")
            }
            if(key.selectedItemPosition == 11 && scale.selectedItemPosition == 1 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nG#, A#, B, C#, D#, E, F#, G#")
            }
            if(key.selectedItemPosition == 11 && scale.selectedItemPosition == 2 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nG#, A#, B, C#, D#, E, G, G#")
            }
            if(key.selectedItemPosition == 11 && scale.selectedItemPosition == 3 && calc.selectedItemPosition == 0){
                result.setText("The scale notes are: \nG#, A#, B, C#, D#, F, G, G# (Ascending) \nG#, F#, E, D#, C#, B, A#, G# (Descending)")
            }

            //Key of G# [11] Scales and Chord Progressions

            if(key.selectedItemPosition == 11 && scale.selectedItemPosition == 0 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \nI-IV-V: G# major, C# major, D# major\n" +
                        "ii-V-I: A# minor, D# major, G# major\n" +
                        "vi-IV-I-V: F minor, C# major, G# major, D# major")
            }
            if(key.selectedItemPosition == 11 && scale.selectedItemPosition == 1 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-iv-V: G# minor, C# minor, D# major\n" +
                        "ii°-V-i: A# diminished, D# major, G# minor\n" +
                        "III+-V-i: B augmented, D# major, G# minor")
            }
            if(key.selectedItemPosition == 11 && scale.selectedItemPosition == 2 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-iv-V: G# minor, C# minor, D# major\n" +
                        "ii°-V-i: A# diminished, D# major, G# minor\n" +
                        "III+-V-i: B augmented, D# major, G# minor")
            }
            if(key.selectedItemPosition == 11 && scale.selectedItemPosition == 3 && calc.selectedItemPosition == 1){
                result.setText("The common chord progressions are: \ni-IV-V: G# minor, C# major, D# major\n" +
                        "ii°-V-i: A# diminished, D# major, G# minor\n" +
                        "III-VI-i-V: B major, E# minor, G# minor, D# major")

            }



        }

    }
}