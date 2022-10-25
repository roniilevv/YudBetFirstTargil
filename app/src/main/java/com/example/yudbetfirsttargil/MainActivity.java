package com.example.yudbetfirsttargil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.buttonAnatomyClick(null);
    }

    public void buttonAnatomyClick(View view){
        TextView textViewSecondaryTitle = findViewById(R.id.textViewSecondaryTitle);
        textViewSecondaryTitle.setText("אנטומיה");

        TextView textViewParagraph = findViewById(R.id.textViewParagraph);
        textViewParagraph.setText("כל ניתוח תנועה של הגוף מתבסס על מצב של עמידה זקופה, בהונות רגליים פונות קדימה, ידיים פשוטות לצידי הגוף, כפות הידיים פונות קדימה.  הגדרה של תנועה מסויימת נעשית לפי העמדה האנטומית.\n" +
                "כדי להגדיר תנועה מסויימת בגוף, מחלקים את הגוף למישורי תנועה. תנועה במישור מסוים חייבת להיות מקבילה לאותו המישור.\n");

        ImageView imageSubject = findViewById(R.id.imageSubject);
        imageSubject.setImageResource(R.drawable.image_anatomy);
    }

    public void buttonPsychoClick(View view){
        TextView textViewSecondaryTitle = findViewById(R.id.textViewSecondaryTitle);
        textViewSecondaryTitle.setText("פסיכולוגיה");

        TextView textViewParagraph = findViewById(R.id.textViewParagraph);
        textViewParagraph.setText("פסיכולוגיה של הספורט הוא תחום שהתפתח רק בשנת 1898, כאשר חוקר בריטי שם לב שישנם גורמים שמשפיעים על תפקודם של רוכבי אופניים. מאז, התחום התעצב, התפתח, תוקצב ונהיה לתת תחום רשמי ומוגדר של פסיכולוגיה.\n");

        ImageView imageSubject = findViewById(R.id.imageSubject);
        imageSubject.setImageResource(R.drawable.image_psycho);
    }

    public void buttonPhizioClick(View view){
        TextView textViewSecondaryTitle = findViewById(R.id.textViewSecondaryTitle);
        textViewSecondaryTitle.setText("פיזיולוגיה");

        TextView textViewParagraph = findViewById(R.id.textViewParagraph);
        textViewParagraph.setText("פיזיולוגיה היא מדע העוסק בחקר התפקוד המכני, הפיזי והביוכימי בגופם של יצורים חיים.\n" +
                "פיזיולוגיה של המאמץ= פיזיולוגיה של המאמץ היא תת תחום מתוך הפיזיולוגיה הכללית. הפיזיולוגיה של המאמץ עוסקת בחקר והבנה של השינויים בתפקוד הכללי של גוף האדם במהלך ביצוע פעילות גופנית.\n" +
                "ענף מדעי זה בוחן את כל התרחישים הביולוגיים- פיזיולוגיים המתרחשים בגופינו בזמן הפעילות הופנית, ועד למצב של איזון טבעי- הומאוסטזיס.\n");

        ImageView imageSubject = findViewById(R.id.imageSubject);
        imageSubject.setImageResource(R.drawable.image_phizio);
    }
}