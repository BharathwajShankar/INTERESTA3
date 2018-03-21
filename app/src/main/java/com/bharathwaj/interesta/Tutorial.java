package com.bharathwaj.interesta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Tutorial extends AppCompatActivity {

    ListView myListView;
    List<String> your_array_list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        myListView = (ListView)findViewById(R.id.mainListView);
        //Populate the array
        your_array_list.add("Cricket");
        your_array_list.add("HowToCricket");
        your_array_list.add("MusicVoiceCulture");
        your_array_list.add("MusicInIndia");
        your_array_list.add("Raagas");
        your_array_list.add("Football");
        your_array_list.add("HowToFootball");
        your_array_list.add("Petcare");
        your_array_list.add("DanceTips");
        your_array_list.add("BodyBuildingTips");
        your_array_list.add("Beauty");
        your_array_list.add("Cooking");
        your_array_list.add("Photography");
        your_array_list.add("Doodling");
        your_array_list.add("DrivingTips");
        //set array to adapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                Tutorial.this,
                android.R.layout.simple_list_item_1,your_array_list );
        //set listview adapter
        myListView.setAdapter(arrayAdapter);


        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //making a paragraph string to store the paragraph text
                String paragraph = "";
                //ifstatement to compare the values and set the paragraph based on the selected item
                if(myListView.getItemAtPosition(position).toString().trim().equals("Cricket")){
                    //setting value of the paragraph string
                    paragraph = "BASIC RULES OF CRICKET\n" +
                            "Content is played between two teams each made up of eleven players. (Sometime in junior competitions you will find 8 player teams).\n" +
                            "Games comprise of at least one innings where each team will take turns in batting and fielding/bowling.\n" +
                            "The fielding team will have a bowler bowl the ball to the batsman who tries to hit the ball with their bat.\n" +
                            "The fielding team tries to get the batsmen out by…\n" +
                            "Hitting the wickets with the ball when bowling\n" +
                            "Catching a batsman’s shot on the full\n" +
                            "Hitting the batsman’s leg in front of the wicket (LBW)\n" +
                            "Or hitting the wickets before the batsmen can run to the other end of the pitch\n" +
                            "The batmen try to score as many runs as possible before getting out by…\n" +
                            "Hitting the ball and running between the wickets and making it to the other end before the fielders can hit the wickets with the ball. Each time you run one full length of the pitch it equals 1 run.\n" +
                            "Hitting the ball to the boundary along the ground is 4 runs.\n" +
                            "Hitting the ball over the boundary on the full equals 6 runs.\n" +
                            "The fielding team must get 10 batsmen out before they can change over and start batting.\n" +
                            "The aim of the game is to score as many runs as possible before the fielding team takes 10 wickets. The team with the most runs wins.\n" +
                            "BASIC CRICKET SKILLS AND EXERCISES\n" +
                            "When your child starts to play sport it always helps them enjoy it more if they have a basic level of skill and understanding of the game. They will be able to participate more, have more confidence and this will stay motivated to keep playing and being active.\n" +
                            "\n" +
                            "To be a good cricket player requires:\n" +
                            "\n" +
                            "Good hand eye co-ordination\n" +
                            "The ability to throw and catch a ball\n" +
                            "Good batting and bowling technique\n" +
                            "The ability to concentrate for sometimes long periods of time\n" +
                            "Below we’ll practice exercises that develop skills 1-2. Good concentration is a skill that can only be developed over time\n" +
                            "        EXERCISE 1 BATTING: HAND EYE CO-ORDINATION AND BATTING TECHNIQUE.\n" +
                            "The late great Don Bradman used to do this exercise everyday as a kid (and it sure worked for him).\n" +
                            "\n" +
                            "Stand about 4 metres back from a concrete wall and hit a tennis ball into the wall. When the ball rebounds hit it again.\n" +
                            "When hitting face side on to the wall, feet shoulder width apart, bat lifted ready to hit the ball. As you hit the ball keep your front elbow up and hit straight through the ball so it bounces once before hitting the wall.\n" +
                            "Try to hit the ball as many times as possible before you lose control and you can even compete against your friends to see who can get the highest number of hits.\n" +
                            "As you improve try using a golf ball to increase the difficulty.\n" +
                            "\n" +
                            "\n" +
                            "EXERCISE 2 FIELDING: HAND-EYE COORDINATION, THROWING AND CATCHING\n" +
                            "“Catches win matches” as the old saying goes so improving hand eye coordination for catching is very important.\n" +
                            "\n" +
                            "Place two balls on the ground 3 metres in front of a wall.\n" +
                            "Pick up the first ball throw it at the wall, clap your hands and the catch the ball with two hands as it rebounds off the wall.\n" +
                            "Then place the ball back on the ground, run to a marker behind you 10 metres away from the wall and run back to the second ball.\n" +
                            "Pick up the second ball throw it at the wall, clap your hands and catch the ball with one hand.\n" +
                            "Place the ball on the ground, run back to the 10-metre marker and return to the first ball, and repeat.\n" +
                            "Aim to increase speed and go as many times as you can without dropping the ball.\n" +
                            "You can also practice catching with your non-dominant hand at the second ball station.\n" +
                            "EXERCISE 3: BOWLING TECHNIQUE\n" +
                            "Learning a proper cricket bowling technique can be difficult for beginners so it’s important to start slowly, get the technique right and then worry about the accuracy of the bowl later. The “Rock and Bowl” is a great learners drill.\n" +
                            "\n" +
                            "Stand side on to the batsmen/wickets with your dominant hand at the back.\n" +
                            "Hold the ball with both hands under your chin and turn your head sideways to face the batsmen/target.\n" +
                            "Rock back and forth transferring weight from the front foot to the back foot in a smooth consistent motion.\n" +
                            "Now as you rock back extend your back arm and when you rock forward let your front arm extend and pull down and your back arm comes over your head and releases the ball in the direction of the batsmen.\n" +
                            "This will take patience and practice to feel comfortable and it’s important to watch your favourite bowlers to see their techniques for some extra tips.\n" +
                            "\n" +
                            "Practicing these 3 exercises regularly will give your child the basic skills they need to join in with cricket matches and have fun.\n";
                }
                else if(myListView.getItemAtPosition(position).toString().trim().equals("HowToCricket")){
                    //setting value of the paragraph string
                    paragraph = "\n" +
                            "Orthodox technique and strokeplay\n" +
                            "Over time a standard batting technique has been developed which is used by most batsmen. Technique refers to the batsman's stance before the ball is bowled as well as the movement of the hands, feet, head and body in the execution of a cricket stroke. Good technique is characterised by quickly getting into the correct position to play the shot, especially getting one's head and body in line with the ball, one's feet placed next to where the ball would bounce and then swinging the bat at the ball to make contact at the precise moment required for the particular stroke being played.\n" +
                            "The movement of the batsman for a particular delivery depends on the shot being attempted. Front-foot shots are played with the weight on the front foot (left foot for a right-hander) and are usually played when the ball is pitched up to the batsman, while back-foot shots are played putting the weight onto the back foot, usually to bowling that is pitched short. Shots may also be described as vertical bat shots, in which the bat is swung vertically at the ball (e.g. when playing a drive or leg glance), or horizontal or cross-bat shots, in which the bat is swung horizontally at the ball (e.g. when playing the pull or cut shot).\n" +
                            "While a batsman is not limited in where or how he may hit the ball, the development of good technique has gone hand in hand with the development of standard or orthodox cricket shots played to specific types of deliveries. These \"textbook\" shots are standard material found in many coaching manuals.\n" +
                            "The advent of limited overs cricket, with its emphasis on rapid run-scoring, has led to increasing use of unorthodox shots to hit the ball into gaps where there are no fielders. Unorthodox shots are typically—but not always— more high-risk than orthodox shots due to some aspects of good batting technique being abandoned.\n" +
                            "Stance\n" +
                            "The stance is the position in which a batsman stands to have the ball bowled to him. An ideal stance is \"comfortable, relaxed and balanced\",[citation needed]with the feet 40 centimetres (16 in) apart, parallel and astride the crease. Additionally, the front shoulder should be pointing down the wicket, the head facing the bowler, the weight equally balanced and the bat near the back toe.[2] As the ball is about to be released, the batsman will lift his bat up behind in anticipation of playing a stroke, and will shift his weight onto the balls of his feet. By doing this he is ready to move swiftly into position to address the ball once he sees its path out of the bowler's hand.\n" +
                            "Although this textbook, side-on stance is the most common, a few international batsmen, such as Shivnarine Chanderpaul, use an \"open\" or \"square on\" stance.\n" +
                            "Backlift\n" +
                            "Backlift is the term used to describe how a batsman lifts his bat in preparation for hitting the ball.\n" +
                            "While the bat should be raised as vertically as possible, coaching manuals often suggest that correct technique is for the bat to be slightly angled from the perpendicular; a common instruction is to point the face of the bat in the direction of first or second slip.\n" +
                            "Some players (notably, in recent times, Brian Lara, Virender Sehwag)[4] have employed an exaggerated backlift. Others, who have employed the more unorthodox open stance, such as Peter Willey, had a more abbreviated backlift.\n" +
                            "Forward and back\n" +
                            "Depending upon the path of the ball, the batsman will either move forward or back in his attempt to intercept it. A forward movement is designated a front foot shot, whereas a backwards movement is designated a back foot shot. A front foot shot is typically used to address a ball arriving at between ankle and thigh height. The batsman will step forward towards the ball, bending his front knee to bring his bat down to the anticipated height of the ball. By moving forwards, the batsman is also able to intercept the ball immediately after it has pitched, thus nullifying any potentially dangerous lateral movement. A back foot shot is typically used to address a ball arriving at between thigh and head height. The batsman will step back and, if necessary, stand on his tip toes to raise his bat to the height of the ball. By stepping back towards the wicket, he also receives the advantage of having an extra small amount of time to react to any unexpected lateral movement or variation in bounce.\n" +
                            "Leave\n" +
                            "The leave is sometimes considered a cricket shot, even though the batsman physically does not play at or interfere with the ball as it passes him. The leave is likely to be used by batsmen during the first few balls they receive, to give themselves time to judge the conditions of the pitch and the bowling before attempting to play a shot. Leaving a delivery is a matter of judgement and technique. The batsman still has to watch the ball closely to ensure that it will not hit him or the wicket; he also has to ensure that his bat and hands are kept out of the path of the ball so that it cannot make accidental contact and possibly lead to him being out caught. Batsmen only leave the ball when they are certain that it will not hit the stumps.\n" +
                            "Vertical bat strokes\n" +
                            "Vertical bat or straight-bat shots can be played off either the front foot or the back foot depending upon the anticipated height of the ball at the moment it reaches the batsman. The characteristic position of the bat is a vertical alignment at point of contact. Vertical bat shots are typically played with the batsman's head directly above the point of contact so that he is able to accurately judge the line of the ball. At this point the bat can either be stationary and facing straight back down the wicket – known as a block or defensive shot; angled to one side – known as a glance or deflection; or travelling forwards towards the bowler – known as a drive.\n" +
                            "Defensive shot\n" +
                            "A block stroke is usually a purely defensive stroke designed to stop the ball from hitting the wicket or the batsman's body. This shot has no strength behind it and is usually played with a light or \"soft\" bottom-hand grip and merely stops the ball moving towards the wicket. A block played on the front foot is known as a forward defensive, while that played on the back foot is known as a backward defensive. The application of these strokes may be used to score runs, by manipulating the block to move the ball into vacant portions of the infield, in which case a block becomes a \"push\". Pushing the ball is one of the more common ways batsmen manipulate the strike.\n" +
                            "Leaving and blocking are employed much more often in first-class cricket (including Test matches), as there is no requirement to score runs as quickly as possible, thus allowing the batsman to choose which deliveries to play.\n" +
                            "Glance\n" +
                            "A leg glance is a delicate straight-batted shot played at a ball aimed slightly on the leg side, using the bat to flick the ball as it passes the batsman, and requiring some wrist work as well, deflecting towards the square leg or fine leg area. The stroke involves deflecting the bat-face towards the leg side at the last moment, head and body moving inside the line of the ball. This shot is played \"off the toes, shins or hip\". It is played off the front foot if the ball is pitched up at the toes or shin of the batsman, or off the back foot if the ball bounces at waist/hip height to the batsman. Although the opposite term off glance is not employed within cricket, the concept of angling the bat face towards the offside to deflect the ball away from the wicket for the purpose of scoring runs through the off side is a commonly used technique. This would commonly be described instead as \"running (or steering) the ball down to third man\".\n" +
                            "Drive\n" +
                            "A drive is a straight-batted shot, played by swinging the bat in a vertical arc through the line of the ball, hitting the ball in front of the batsman along the ground. It is one of the most common shots in a batsman's armoury and often the first shot taught to junior cricketers. Depending on the direction the ball travels, a drive can be a cover drive (struck towards the cover fielding position), an off drive (towards mid-off), straight drive (straight past the bowler), on drive (between stumps and mid-on) or square drive (towards point). A drive can also be played towards midwicket, although the phrase \"midwicket drive\" is not in common usage. Drives can be played both off the front and the back foot, but back-foot drives are harder to force through the line of the ball. Although most drives are deliberately struck along the ground to reduce the risk of being dismissed caught, a batsman may decide to play a lofted drive to hit the ball over the infielders and potentially even over the boundary for six.\n" +
                            "Flick\n" +
                            "A flick shot is a straight-batted shot played on the leg side by flicking a full-length delivery using the wrists. It is often also called the clip off the legs. The shot is playing with the bat coming through straight as for the on drive, but the bat face is angled towards the leg side. It can be played both off the front foot or the back foot, either off the toes or from the hips. The shot is played between the mid on and square leg region. Typically played along the ground, the flick can also be played by lofting the ball over the infield.\n" +
                            "Horizontal bat shots\n" +
                            "The second class of cricket stroke comprises the horizontal bat shots, also known as cross bat shots: the cut, the square drive, the pull, the hook and the sweep. Typically, horizontal bat shots have a greater probability of failing to make contact with the ball than vertical bat shots, and therefore are restricted to deliveries that are not threatening to hit the stumps, either by dint of being too wide or too short. The bat is swung in a horizontal arc, with the batsman's head typically not being perfectly in line with the ball at point of contact.\n" +
                            "Cut\n" +
                            "A cut is a cross-batted shot played at a short-pitched ball, placing it wide on the off side. The batsman makes contact with the ball as it draws alongside or passes him and therefore requires virtually no effort on his part as he uses the bowler's pace to divert the ball. A square cut is a shot hit into the off side at near to 90 degrees from the wicket (towards point). A late cut is played as or after the ball passes the batsman's body and is hit towards third man. The cut shot is typically played off the back foot, but is also sometimes played off the front foot against slower bowling. The cut should be played with the face of the bat rolling over the ball to face the ground thus pushing the ball downwards. A mistimed cut with an open-faced bat (with the face of the bat facing the bowler) will generally lead to the ball rising in the air, giving a chance for the batsman to be caught.\n" +
                            "Square drive\n" +
                            "Although confusingly named a drive, the square drive is actually a horizontal bat shot, with identical arm mechanics to that of the square cut. The difference between the cut and the square drive is the height of the ball at contact: the cut is played to a ball bouncing waist high or above with the batsman standing tall, whereas the square drive is played to a wide ball of shin height with the batsman bending his knees and crouching low to make contact.\n" +
                            "Pull and hook\n" +
                            "A pull is a cross-batted shot played to a ball bouncing around waist height by swinging the bat in a horizontal arc in front of the body, pulling it around to the leg side towards mid-wicket or square leg. The term hook shot is used when the shot is played against a ball bouncing at or above chest high to the batsman, the batsman thus \"hooking\" the ball around behind square leg, either along the ground or in the air. Pull and hook shots can be played off front or back foot, with back foot being more typical.\n" +
                            "Sweep\n" +
                            "A sweep is a cross-batted front foot shot played to a low bouncing ball, usually from a slow bowler, by kneeling on one knee, bringing the head down in line with the ball and swinging the bat around in a horizontal arc near the pitch as the ball arrives, sweeping it around to the leg side, typically towards square leg or fine leg. A paddle sweep shot is a sweep shot in which the ball is deflected towards fine leg with a stationary or near-stationary bat extended horizontally towards the bowler, whereas the hard sweep shot is played towards square leg with the bat swung firmly in a horizontal arc. Typically the sweep shot will be played to a legside delivery, but it is also possible for a batsman to sweep the ball to the legside from outside off stump. Attempting to sweep a full straight delivery on the stumps is generally not recommended because of the risk of lbw.\n" +
                            "Unorthodox strokeplay\n" +
                            "Since a batsman is free to play any shot to any type of delivery as he wishes, the above list is by no means a complete list of the strokes that batsmen choose to play. Many unorthodox, typically high-risk, shots have been used throughout the history of the game. The advent of limited overs cricket has seen the increased use of unorthodox shots to hit the ball into gaps where there are no fielders placed. Unorthodox shots are rarely used in first-class cricket as the pace of the game is slower and it is relatively more important to keep one's wicket than to try to score runs off every ball.\n" +
                            "A few unorthodox shots have gained enough popularity or notoriety to have been given their own names and entered common usage.\n" +
                            "Reverse sweep\n" +
                            "A reverse sweep is a crossbatted sweep shot played in the opposite direction to the standard sweep, thus instead of sweeping the ball to the leg side, it is swept to the off side, towards backward point or third man. The batsman may also swap his hands on the bat handle to make the stroke easier to execute. The batsman may also bring his back foot to the front therefore making it more like a traditional sweep. The advantage of a reverse sweep is that it effectively reverses the fielding positions and thus is very difficult to set a field to. It is also a risky shot for the batsman as it increases the chance of LBW and also is quite easy to top edge to a fielder.\n" +
                            "It was first regularly played in the 1970s by the Pakistani batsman Mushtaq Mohammad, though Mushtaq's brother Hanif Mohammad is sometimes credited as the inventor. Content coach Bob Woolmer has been credited with popularising the stroke. The most famous example of a reverse sweep backfiring was in the case of Mike Gatting of England against Allan Border of Australia in the 1987 Content World Cup Final. With England on course for victory, Gatting attempted a reverse sweep off the first delivery bowled by Border, topedged the ball and was caught by wicketkeeper Greg Dyer. England subsequently lost momentum and eventually lost the match.\n" +
                            "Because of the unorthodox nature of hand and body position, it is often difficult to get a lot of power behind a reverse sweep; in many situations, the intention is to glance or cut the ball to the backward leg area. However, in rare occasions, players have been able to execute reverse sweeps for a six. Kevin Pietersen, who pioneered switch hitting, is adept at this, but one could argue[original research?] that the resulting shot is basically a sweep rather than a reverse sweep. A more classic example of such a shot would be Yusuf Pathan's six off Robin Peterson. South Africa's AB de Villiers is well known for his ability to hit sixes with the reverse sweep at ease and Glenn Maxwell also often plays reverse sweep.\n" +
                            "Slog and slog sweep\n" +
                            "A slog is a powerful pull shot played over mid-wicket, usually hit in the air in an attempt to score a six. A shot would be described as a slog when it is typically played at a delivery that would not ordinarily be pulled. A slog can also be described as hitting the ball to \"cow corner\". This phrase is designed to imply that the batsman is unsophisticated in his strokeplay and technique by suggesting he would be more at home playing on more rudimentary cricket fields in which there may be cows grazing along the boundary edge. The slog can be an effective shot because all the batsman's power and body weight can be put into swinging the bat at the ball.\n" +
                            "A slog sweep is a slog played from the kneeling position used to sweep. Slog sweeps are usually directed over square-leg rather than to mid-wicket. It is almost exclusively used against reasonably full-pitched balls from slow bowlers, as only then does the batsman have time to sight the length and adopt the kneeling position required for the slog sweep. The front leg of the shot is usually placed wider outside leg stump to allow for a full swing of the bat.\n" +
                            "Upper cut\n" +
                            "An upper cut is a shot played towards third man, usually hit when the ball is pitched outside the off stump with an extra bounce. It is a dangerous shot which can edge the batsman to keeper or slips if not executed correctly. The shot is widely used in modern cricket. The shot is advantageous in fast bouncy tracks and is seen commonly in Twenty20 cricket.\n" +
                            "Switch hit\n" +
                            "A switch hit is a shot where a batsman changes his handedness and posture to adopt a stance the mirror image of his traditional handedness while the bowler is running in to bowl. As a fielding team cannot manoeuvre fielders while the bowler is in his run-up, the fielding side is effectively wrong-footed with the fielders out of position. The shot was pioneered by Kevin Pietersen, first performed off the bowling of Muttiah Muralitharan in England's 2006 home series against Sri Lanka. It was subsequently used in the New Zealand series in England in 2008 when Pietersen performed the shot twice in the same over against Scott Styris on his way to making an unbeaten century. David Warner, the Australian opening batsman, is also a frequent user of the switch hit and used it to great effect against the Indian off-spinner Ravichandran Ashwin in the first Twenty20 of the Indian cricket team's tour to Australia 2012. He is also possible to bat right-handed due to his experience in doing so in youth cricket.\n" +
                            "The legality of the switch hit was questioned when first introduced, but cleared by the International Content Council as legal. The shot is risky because a batsman is less proficient in the other handedness and is more likely to make a mistake in the execution of his shot.\n" +
                            "Scoop / ramp\n" +
                            "A scoop shot (also known as a ramp shot, paddle scoop, Marillier shot or Dilscoop) has been used by a number of first-class batsmen, the first being Dougie Marillier. It is played to short pitched straight balls that would traditionally be defended or, more aggressively, pulled to the leg side. To play a scoop shot, the batsman is on the front foot and aims to get beneath the bounce of the ball and hit it directly behind the stumps, up and over the wicket-keeper.\n" +
                            "This shot, though risky in the execution, has the advantage of being aimed at a section of the field where a fielder is rarely placed – particularly in Twenty20 and One Day International cricket where the number of outfielders is limited. However, the Marillier shot is played over the batsman's shoulder to fine leg, but the basis of the scoop stroke is for the batsman to go down on one knee to a good length or slightly short-of-length delivery off a fast or medium paced bowler and scoop the ball over the head of the wicket-keeper. The scoop shot is a risky shot to play as the improper execution of this shot may lead to a catch being offered. One famous example of the scoop backfiring is of the 2007 ICC World Twenty20 Final when Pakistan were 152/9 and needed 6 runs off 4 balls and Misbah-ul-Haq improperly executed this shot resulting in a catch to Sreesanth.\n" +
                            "A version of the scoop stroke called the Dilscoop was developed by Sri Lankan right-handed batsman Tillakaratne Dilshan during the 2009 ICC World Twenty20\nBowling,\n" +
                            " in cricket, is the action of propelling the ball toward the wicket defended by a batsman. A player skilled at bowling is called a bowler; a bowler who is also a competent batsman is known as an all-rounder. Bowling the ball is distinguished from throwing the ballby a strictly specified biomechanical definition, which restricts the angle of extension of the elbow. A single act of bowling the ball towards the batsman is called a ball or a delivery. Bowlers bowl deliveries in sets of six, called an over. Once a bowler has bowled an over, a teammate will bowl an over from the other end of the pitch. The Laws of Cricket govern how a ball must be bowled.[1] If a ball is bowled illegally, an umpire will rule it a no-ball.[2] If a ball is bowled too wide of the striker for the batsman to be able to play at it with a proper cricket shot, the bowler's end umpire will rule it a wide.[3]\n" +
                            "There are different types of bowlers, from fast bowlers, whose primary weapon is pace, through swing and seam bowlers who try to make the ball deviate in its course through the air or when it bounces, to slow bowlers, who will attempt to deceive the batsmen with a variety of flight and spin. A spin bowler usually delivers the ball quite slowly and puts spin on the ball, causing it to turn at an angle while bouncing off the pitch.\n" +
                            "History of bowling\n" +
                            "In the early days of cricket, underarm bowling was the only method employed. Many theories exist about the origins of cricket. One suggests that the game began among shepherds hitting a stone or a ball of wool with their crooks and, at the same time, defending the wicket gate into the sheep-fold (from Anglo Saxon'cricce', a crooked staff). A second theory suggests the name came from a low stool known as a 'cricket' in England, which from the side looked like the long, low wicket used in the early days of the game (originally from the Flemish 'krickstoel', a low stool on which parishioners knelt in church). There is also a reference to 'criquet' in North-East France in 1478 and evidence that the game evolved in South-East England in the Middle Ages.\n" +
                            "In 1706 William Goldwyn published the first description of the game. He wrote that two teams were first seen carrying their curving bats to the venue, choosing a pitch and arguing over the rules to be played. They pitched two sets of wickets, each with a \"milk-white\" bail perched on two stumps; toss a coin for first knock, the umpire called \"play\" and the \"leathern orb\" was bowled. They had four-ball overs, the umpires leant on their staves (which the batters had to touch to complete a run), and the scorers sat on a mound making notches.\n" +
                            "The first written \"Laws of Cricket\" were drawn up in 1744. They stated, \"the principals shall choose from amongst the gentlemen present two umpires who shall absolutely decide all disputes. The stumps must be 22 inches high and the bail across them six inches. The ball must be between 5 & 6 ounces, and the two sets of stumps 22 yards apart\". There were no limits on the shape or size of the bat. It appears that 40 notches was viewed as a very big score, probably due to the bowlers bowling quickly at shins unprotected by pads. The world's first cricket club was formed in Hambledon in the 1760s and the Marylebone Cricket Club (MCC) was founded in 1787.\n" +
                            "During the 1760s and 1770s it became common to pitch the ball through the air, rather than roll it along the ground. This innovation gave bowlers the weapons of length, deception through the air, plus increased pace. It also opened new possibilities for spin and swerve. In response, batters had to master timing and shot selection. One immediate consequence was the replacement of the curving bat with the straight one. All of this raised the premium on skill and lessened the influence of rough ground and brute force. It was in the 1770s that the modern game began to take shape. The weight of the ball was limited to between five and a half and five and three-quarter ounces, and the width of the bat to four inches. The latter ruling followed an innings by a batter called Thomas \"Daddy\" White, who appeared with a bat the width of the wicket. In 1774, the first leg before law was published. Also around this time, a third stump became commonplace. By 1780, the duration of an important match was generally three days, and this year also saw the creation of the first six-seam cricket ball. In 1788, the MCC published its first revision of the laws, which prohibited charging down an opponent and also provided for mowing and covering the wicket in order to standardise conditions. The desire for standardisation reflected the massive increase in the popularity of cricket during the 18th century. Between 1730 and 1740, 150 cricket matches were recorded in the papers of the time. Between 1750 and 1760, this figure rose to 230, and between 1770 and 1790 over 500.\n" +
                            "The 19th century saw a series of significant changes. Wide deliveries were outlawed in 1811. The circumference of the ball was specified for the first time in 1838 (its weight had been dictated 60 years earlier). Pads, made of cork, became available for the first time in 1841, and these were further developed following the invention of vulcanised rubber, which was also used to introduce protective gloves in 1848. In the 1870s, boundaries were introduced – previously, all hits had to be run; if the ball went into the crowd, the spectators would clear a way for the fieldsman to fetch it. The biggest change, however, was in how the ball was delivered by the bowler.\n" +
                            "At the start of the century, all bowlers were still delivering the ball under-arm. However, so the story goes, John Willes became the first bowler to use a \"round-arm\" technique after practising with his sister Christina, who had used the technique, as she was unable to bowl underarm due to her wide dress impeding her delivery of the ball.[5]\n" +
                            "The round-arm action came to be employed widely in matches but was quickly determined to be illegal and banned by the MCC, who stated that \"the ball must be delivered underhand, not thrown or jerked, with the hand underneath the elbow at the time of delivering the ball\".[6] When it was accepted the rules stated that the arm could not be raised above the shoulder. It was quickly found, however, that a raised arm imparted more accuracy and generated more bounce than the roundarm method. Again, the governing body banned the method. It was not until the method was finally accepted by the MCC in 1835[7] that it grew rapidly in popularity amongst all players. Underarm bowling hitherto had almost disappeared from the game.\n" +
                            "Modern-day underarm bowling\n" +
                            "An infamous \"underarm bowling incident\" occurred during a match in 1981, in which the Australian bowler, Trevor Chappell, took advantage of the fact that underarm bowling was still legal by rolling the ball along the ground. By doing so he avoided the possibility that the New Zealand batsman, Brian McKechnie, would score a six from the last ball to tie the match, as the bat would not be able to hit the ball high enough to score a six.[8]\n" +
                            "As a result of this incident underarm bowling was subsequently made illegal in all grades of cricket, except by prior agreement of both teams, as it was not considered to be within the spirit of the game\n" +
                            "The bowling action\n" +
                            "Australian fast bowler Brett Lee in action in 2005.Bowling the ball is distinguished from simply throwing the ball by a strictly specified biomechanical definition.Originally, this definition said that the elbow joint must not straighten out during the bowling action. Bowlers generally hold their elbows fully extended and rotate the arm vertically about the shoulder joint to impart velocity to the ball, releasing it near the top of the arc. Flexion at the elbow is not allowed, but any extension of the elbow was deemed to be a throw and would be liable to be called a no-ball. This was thought to be possibleonly if the bowler's elbow was originally held in a slightly flexed position.In 2005, this definition was deemed to be physically impossible by a scientific investigative commission. Biomechanical studies that showed that almost all bowlers extend their elbows somewhat throughout the bowling action, because the stress of swinging the arm around hyperextends the elbow joint. A guideline was introduced to allow extensions or hyperextensions of angles up to 15 degrees before deeming the\n" +
                            "ball illegally thrown.Bowling actions are typically divided into side on and front on actions. In the side on action, the back foot lands parallel to the bowling crease and the bowler aims at the wicket by looking over his front shoulder. In the front on action, the back foot lands pointing down the pitch and the bowler aims at the wicket by looking inside the line of his front arm. Many bowlers operate with a mid-way action with the back foot landing at roughly 45 degrees and the upper body aligned somewhere between side on and front on. This is not to be confused with a mixedaction, which mixes distinct elements of both side on and front on actions, and is generally discouraged amongst young bowlers as it can lead to problems in later life due to the twisting of the back inherent in the action.\n" +
                            "Goals of bowling\n" +
                            "In a game of cricket, the ultimate priority of the fielding side is to restrict the total number of runs scored by the batting side, and the actions of the bowlers will be fundamental to achieving this objective. The primary means of achieving this is by dismissing the batting side by getting all ten of the opposition wickets as quickly as possible. A secondary objective will be to keep the batting side's run rate as low as possible. In fact, in most forms of cricket, the twin aims of the fielding side are targeted concurrently, as the achievement of one aim tends to have a positive effect upon the other. Taking regular opposition wickets will remove the better batsmen from the crease, typically leading to a slowing of the scoring rate. Conversely, slowing the scoring rate can put additional pressure on the batsmen and force them into taking extra risks, which will often lead to wickets.\n" +
                            "Depending upon the format of the match, these two strategies will be given different weights. In an unlimited, timed or declaration match, the main aim of the bowling attack will be to take wickets, so attacking bowling and fielding strategies will be used. In a limited overs match, this aim will also be supplemented by the secondary need to prevent the batting side from scoring quickly, so more defensive strategies will be used. In general, the shorter the number of overs per side, the more priority will be given to this secondary target of maintaining a low run-rate. It is also highly probable that the need for attacking or defensive strategies can switch frequently as a cricket match progresses. It is the sign of a good cricket captain to be able to tell which strategy is most appropriate in any set of circumstances and the best way of implementing it.\n" +
                            "Bowling tactics\n" +
                            "The simultaneous twin objectives of bowling are to take wickets and prevent run scoring opportunities. Both objectives are achieved through the underlying aim of bowling the ball in such a way that the batsman is unable to connect with the ball in the middle of the bat and control its movement after contact. There are three distinct means of achieving this aim: by bowling the ball on a good line and length, by bowling with sufficient pacethat the batsman struggles to react to the delivery, or by bowling the ball in such a way that it has lateral movement as it approaches the batsman, either in the air or off the ground. A good bowler may be able to combine two of these skills, a truly great bowler may be able to combine all three.\n" +
                            "Line and length\n" +
                            "The fundamental skill of bowling on a good length incorporates the ability to pitch the ball such a distance from the batsman that he is unable to move forward and drive the ball on the half volley, and is also unable to step back and play the ball on the back foot. This removes many of the batsman's attacking options, and also increases the probability of him misjudging a delivery and losing his wicket. A good length delivery is one in which the ball has had sufficient time to move far enough off the pitch to beat the bat but the batsman has not had time to react to the movement and adjust his shot. The faster the bowler and the greater the movement he is able to generate, the larger the area of the pitch that can be designated an effective \"good\" length.\n" +
                            "Other areas of the pitch may also often be used as a variation to a good length delivery. Primarily these are the yorker, in which the ball is bowled directly at the batsman's feet as a surprise delivery intended to dismiss the batsman bowled, and the bouncer in which the ball is bowled on such a short length that it rises towards the batsman's throat or head as a means of physical intimidation. But the height of an attempted yorker or full toss must not be higher than the batsman's waist, or else it will be called a no-ball beamer, which could have bowlers banned from the match.\n" +
                            "The line a bowler chooses to bowl will depend on several factors: the movement he is generating on the ball, the shots the batsman is able to play, and the field the captain has set. The two most common tactics are to either bowl directly at the stumps, or to bowl 3 inches to 6 inches outside the line of off stump. Bowling at the stumps is an attacking tactic with the intention of dismissing the batsman bowled or lbw. It can also be used as a defensive tactic, as the batsman will feel less able to play risky shots knowing that he will be dismissed should he miss the ball. Bowling outside off stump is known as the corridor of uncertainty. When done well, this line may confuse the batsman into whether to defend the ball or leave it, and may tempt him to play away from his body with his head not in line with the ball. The main aim of this tactic is to dismiss the batman caught by the wicketkeeper or in the slips. Other bowling variations, such as bowling wide of off stump or bowling at leg stump are generally seen as negative and defensive tactics.\n" +
                            "Some different types of bowling tactic:\n" +
                            "\uF0B7Bodyline\n" +
                            "\uF0B7Leg theory\n" +
                            "\uF0B7Off theory\n" +
                            "Pace and movement\n" +
                            "Other than the ability to land the ball on a strategically optimum line and length, the main weapons of the bowler are his ability to move the ball sideways as it approaches the batsman and his ability to deliver the ball at a high velocity.\n" +
                            "The velocities of cricket bowlers vary between 40 and 100 mph (64 and 161 km/h). In professional cricket, a bowler in the 40–60 mph range would be said to be a slow bowler, in the 60–80 mph range a medium pace bowler, and a bowler 80 mph+ a fast bowler. In the amateur game, these distinctions would be approximately 10 mph slower. Many professional fast bowlers are able to reach speeds of over 85 mph, with a handful of bowlers in the world able to bowl at 95 mph+. The ability to react to a cricket ball travelling at 85 mph is a skill that only professional and high level amateur cricketers possess. The pace of a bowler not only challenges the reaction speed of the batsman, but also his physical courage. Fast bowlers are able to exploit this by bowling bouncers, either regularly or as an occasional surprise delivery.\n" +
                            "Bowlers are also able to get the ball to move sideways by using either spin or swing. Adding a spin to a cricket ball will make it deviate due to the Magnus effect in its flight, and then produce sideways movement off the ground. Swing is obtained by using air pressure differences caused by angling the seam of the cricket ball to produce a lateral movement in the air. Fast bowlers will generally only use swing to obtain movement, but medium pace and slow bowlers will often use a combination of the two. The intention is that in creating movement in the delivery, the batsman will misjudge the line of the ball as it arrives, causing him to miss it entirely, in which case he may be dismissed bowled or lbw, or miss-hit it, in which case he may be out caught.\n" +
                            "In order to prevent from becoming predictable, a bowler will typically bowl a variety of different deliveries with different combinations of pace and movement. A tactically astute bowler may be able to spot a potential weakness in a batsman that a particular delivery may be able to exploit. Bowlers will often also bowl deliveries in preplanned sets, with the intention of dismissing the batsman with the final delivery in the set. This is known as \"setting a trap\" for the batsman. Batsmen and bowlers will often also engage in a game of \"cat and mouse\", in which the bowler varies his tactics in order to try and trap and dismiss the batsman, but the batsman also keeps adjusting his tactics in response.\n" +
                            "Limited overs\n" +
                            "In limited overs cricket, there is a limitation on the number of overs each bowler can bowl. This number depends on the match length, and is usually 20% of the total overs in the innings. For example, the usual limit for twenty-over cricket is four overs per bowler, for forty-over cricket eight per bowler and for fifty-over cricket ten per bowler. There is, however, no limit on the number of overs each bowler may bowl in first-class cricket matches, except that no two overs can be bowled consecutively thus restricting any one bowler from a maximum of 50% (plus 1 over) of each innings total. The rule also applies in terms of breaks within a Test innings (Drinks, Lunch and Tea breaks, end of day and beginning of next day). The rule can only been broken if one finishes the end of the previous match starts the next match" +
                            "Cricket pitch\n" +
                            "In the game of cricket, the cricket pitch consists of the central strip of the cricket field between the wickets – 1 chain or 22 yards (20.12 m) long and 10 feet (3.05 m) wide. The surface is flat and normally covered with extremely short grass though this grass is soon removed by wear at the ends of the pitch.\n" +
                            "In amateur matches in some parts of the world, artificial pitches are sometimes used. These can be a slab of concrete, overlaid with a coir mat, artificial turf, sometimes dirt is put over the coir mat to provide an authentic feeling pitch. Artificial pitches are rare in professional cricket, being used only when exhibition matches are played in regions where cricket is not a common sport.\n" +
                            "The pitch has specific markings delineating the creases, as specified by the Laws of Cricket.\n" +
                            "The word wicket often occurs in reference to the pitch. Although technically incorrect according to the Laws of Cricket (Law 6 covers the pitch and Law 8 the wickets, distinguishing between them), cricket players, followers, and commentators persist in the usage, with context eliminating any possible ambiguity. Track is yet another synonym for pitch.\n" +
                            "The rectangular central area of the cricket field – the space used for pitches – is known as the square. Cricket pitches are usually oriented as close to the north-south direction as practical, because the low afternoon sun would be dangerous for a batsman facing due west.[1]\n" +
                            "Protected area\n" +
                            "A wicket consists of three stumps that are placed into the ground and topped with two bails.\n" +
                            "The protected area or danger area is the central portion of the pitch—a rectangle running down the middle of the pitch, two feet wide, and beginning five feet from each popping crease. Under the Laws of Cricket, a bowler must avoid running on this area during his follow-through after delivering the ball.The pitch is protected to preserve fairness in the game. Whenever a bowler follows through on the pitch, it creates patches in the dirt that cause unpredictable swing and bounce. These areas can be exploited by the bowlers to change the outcome of the match. If a bowler runs on the protected area, an umpire will issue a warning to the bowler and to his team captain. The umpire issues a second and final warning if the bowler transgresses again. On the third offence, the umpire will eject the bowler from the attack and the bowler may not bowl again for the remainder of the innings.[2]The protected area is protected in this way because the ball normally bounces on the pitch within this region, and if it is scuffed or damaged by the bowler's footmarks it can give an unfair advantage to the bowling side. The rule does not prevent the bowler or any other fielder from running on the protected area in an effort to field the ball; it applies only to the uninterrupted follow-through.\n" +
                            "State of the pitch\n" +
                            "A perspective view of the cricket pitch from the bowler's end. The bowler runs in past one side of the wicket at the bowler's end, either 'over' the wicket or 'round' the wicket.\n" +
                            "A natural pitch with grass longer or more moist than usual is described as a green pitch or green seamer.[3] This favours the bowler over the batsman as the ball can be made to behave erratically on longer or wet grass. Most club and social cricket is played on pitches that professional cricketers would call green.A sticky wicket – a pitch that has become wet and is subsequently drying out, often rapidly in hot sun – causes the ball to behave erratically, particularly for the slower or spin bowlers. However, modern pitches are generally protected from rain and dew before and during games so a sticky pitch is rarely seen in first-class cricket. The phrase, however, has retained currency and extended beyond cricket to mean any difficult situation.[4]As a match progresses, the pitch dries out. The Laws of Cricket bar watering the pitch during a match. As it dries out, initially batting becomes easier as any moisture disappears. Over the course of a four or five-day match, however, the pitch begins to crack, then crumble and become dusty. This kind of pitch is colloquially known as a 'dust bowl' or 'minefield'. This again favours bowlers, particularly spin bowlers who can obtain large amounts of traction on the surface and make the ball spin a long way.\n" +
                            "This change in the relative difficulties of batting and bowling as the state of the pitch changes during a match is one of the primary strategic considerations that the captain of the team that wins the coin toss will take into account when deciding which team will bat first and can accordingly finalise his decisions.\n" +
                            "Uncovered pitches\n" +
                            "Cricket was initially played on uncovered pitches. Uncovered pitches began to be phased out in the 1970s.[5]\n" +
                            "Covering the pitch\n" +
                            "Cricket pitch dimensions\n" +
                            "The pitch is said to be covered when the groundsmen have placed covers on it to protect it against rain or dew. The use or non-use of covers significantly affects the way the ball comes off the pitch, making the matter potentially controversial. Law 11 of the Laws of Cricket provides that during the match the pitch shall not be completely covered unless provided otherwise by regulations or by agreement before the toss. When possible, the bowlers' run ups are covered in inclement weather to keep them dry. If the pitch is covered overnight, the covers are removed in the morning at the earliest possible moment on each day that play is expected to take place. If covers are used during the day as protection from inclement weather or if inclement weather delays the removal of overnight covers, they are removed as soon as conditions allow. Excess water can be removed from a pitch or the outfield using a machine called a water hog.[4]\n" +
                            "Preparation and maintenance of the playing area\n" +
                            "Law 9 of the Laws of Cricket sets out rules covering the preparation and maintenance of the playing area.\n" +
                            "Rolling the pitch\n" +
                            "During the match, the captain of the batting side may request the rolling of the pitch for a period of not more than 7 minutes before the start of each innings (other than the first innings of the match) and before the start of each subsequent day's play. In addition, if, after the toss and before the first innings of the match, the start is delayed, the captain of the batting side may request to have the pitch rolled for not more than 7 minutes, unless the umpires together agree that the delay has had no significant effect on the state of the pitch. Once the game has begun, rolling may not take place other than in these circumstances.\n" +
                            "If there is more than one roller available, the captain of the batting side shall have the choice. Detailed rules exist to make sure that, where possible, rolling takes place without delaying the game but the game is delayed if necessary to allow the batting captain to have up to 7 minutes rolling if he so wishes. Rolling the pitch can take a long time but will be very effective once done, rolling of the pitch is crucial to whether it is better for a batsmen or a bowler.\n" +
                            "For the 2010 County Championship season, the heavy roller was banned from use during a County Championship match. The belief was that the heavy roller was helping to make pitches flat, and therefore producing too many drawn games.[6]\n" +
                            "Sweeping\n" +
                            "Before a pitch is rolled it is first swept to avoid any possible damage caused by rolling in debris. The pitch is also cleared of any debris at all intervals for meals, between innings and at the beginning of each day. The only exception to this is that the umpires do not allow sweeping to take place where they consider it may be detrimental to the surface of the pitch.\n" +
                            "Mowing\n" +
                            "Groundsmen mow the pitch on each day of a match on which play is expected to take place. Once a game has begun, mowings take place under the supervision of the umpires.\n" +
                            "Footholes and footholds\n" +
                            "The umpires are required to make sure that bowlers' and batsmen's footholes are cleaned out and dried whenever necessary to facilitate play. In matches of more than one day's duration, if necessary, the footholes made by the bowler in his delivery stride may be returfed or covered with quick-setting fillings to make them safe and secure. Players may also secure their footholes using sawdust provided that the pitch is not damaged or they do not do so in a way that is unfair to the other team.\n" +
                            "Research\n" +
                            "England is the hub for considerable research in the preparation of cricket pitches, with Cranfield University working with the ECB and The Institute of Groundsmanship (IOG).[7]\n" +
                            "Practising on the field[\n" +
                            "The rules do not allow players to practise bowling or batting on the pitch, or on the area parallel and immediately adjacent to the pitch, at any time on any day of the match. Practice on a day of a match on any other part of the cricket square may take place only before the start of play or after the close of play on that day and must cease 30 minutes before the scheduled start of play or if detrimental to the surface of the square.\n" +
                            "Typically players do practise on the field of play, but not on the cricket square, during the game. Also bowlers sometimes practise run ups during the game. However, no practice or trial run-up is permitted on the field of play during play if it could result in a waste of time. The rules concerning practice on the field are covered principally by Law 26 of the Laws of Cricket.\n" +
                            "Typical pitches\n" +
                            "Pitches in different parts of the world have different characteristics. The nature of the pitch plays an important role in the actual game: it may have a significant influence on team selection and other aspects. A spin bowler may be preferred in the Indian subcontinent where the dry pitches assist spinners (especially towards the end of a five-day test match) whereas an all pace attack may be used in places like Australia where the pitches are bouncy.\n" +
                            "Pitches in England and Wales\n" +
                            "Green, swing promoting and humid conditions sums up the construction of English pitches with a lot depending on the weather. Early in the season, most batsmen have to be on their guard as English pitches prove to be most fickle, like the country's weather. Later in the summer, the pitches tend to get harder and lose their green which makes the task easier for batsmen. Spinners prove less effective in the first half of the season and tend to play their part only in the second half. The humid conditions and little dust makes the grounds ideal place to practise reverse swing with a 50-over old ball.\n" +
                            "Pitches in Australia\n" +
                            "Pitches in Australia have traditionally been known to be good for fast bowlers because of the amount of bounce that can be generated on these surfaces. In particular, the pitch at the WACA Ground in Perth is regarded as being possibly the quickest pitch in the world. The Gabba in Brisbane is also known to assist fast bowlers with its bounce. However, these kinds of bouncy pitches also open up more areas for run-scoring, as they promote the playing of a lot of pull, hook and cut shots. Batsmen who play these shots will have a lot of success on these pitches.\n" +
                            "Other stadiums like Adelaide Oval and Sydney Cricket Ground have been known to assist spinners more as these pitches have more dust cover. This makes the stadiums an attractive ground for batsmen; teams on an average have scores of 300 or above in their first innings. The Melbourne Cricket Ground can assist seam bowlers initially, but it has a tennis-ball bounce which can negate the potency of bowlers once a match progresses.Swing bowling can be a weapon in Australia, but unlike England, it depends upon the overhead conditions, similar to the Indian subcontinent.\n" +
                            "Pitches in India\n" +
                            "Pitches in India have historically supported spin bowling rather than seam or swing. A ball bowled at pace may not carry well to the keeper taking slip catches out of the equation. Such pitches had virtually no grass, afforded little assistance for pace, bounce, or lateral air movement, but created good turn. In decades past, legendary spin bowlers—most notably the Indian spin quartet of the 1960s and 1970s, consisting of left-armer Bedi, offspinners Prasanna and Venkataraghavan, and legspinner Chandrasekhar—routinely toyed with visiting teams to plot dramatic victories for India in home test matches, particularly on turning pitches in hot, humid conditions at Eden Gardens in Kolkata (then known as Calcutta) and Chepauk in Chennai (then known as Madras).\n" +
                            "They outwitted opposing batsmen not only through line, length, and trajectory variations but also by physically and psychologically exploiting rough spots resulting from wear and tear on the playing top and cracks from increasing surface dryness as a game progressed. The Indian batsmen, being accustomed to these pitch styles, generally relished home conditions. While the Brabourne and Wankhede stadiums in Mumbai and Ferozshah Kotla in Delhi never offered nearly as much turn to spinners.\n" +
                            "Indian pitches and attitudes have changed considerably in the past few years though. The induction of several newer 'green top' venues (such as the ones at Mohali and at Dharamshala), the emergence of Indian fast bowlers, plus the development of domestic league cricket with international participants in the form of IPL, Ranji Trophy, ICL, have resulted in a greater variety of pitches. Some contemporary pitches provide good support for pace, bounce, and swing. Surfaces are often tailor made to be flat tops or excessively batsmen-friendly, for the sake of maximising entertainment value, at the expense of all types of bowlers. But at time the reverse is true especially in the IPL wherein pace heavy teams often come-up with green pace friendly pitches to maximise chances of victory.\n" +
                            "Pitches in South AfricaPitches resemble those in Australia with added swing (lateral) movement and comparatively lesser bounce. However, genuine fast bowlers who can hit the deck hard and hope for some seam as well do the most damage. Spinners gain little assistance, as in New Zealand, and have to toil hard.\n" +
                            "Pitches in New Zealand\n" +
                            "Pitches in New Zealand, like the ones at Eden Park, Auckland and Basin Reserve, Wellington can have a green tinge similar to their counterparts in England. The ball swings a lot due to the proximity of most grounds to the sea, relative humidity and moisture under the surface. New Zealand pitches are often bouncy and quick in nature due to the usual grass cover left on them. The grass cover offers seam movement early on, but also maintains the integrity of the pitch which can often dampen the effect of spin bowling but allows pitches to flatten out over the course of a match. Batting can be trying early on and batsman often take time to adjust to the conditions.\n" +
                            "Pitches in the West Indies\n" +
                            "The West Indies tends to produce balanced pitches. Neither is the bounce too disconcerting nor is the movement extravagant. It also does not assist spin like subcontinent pitches and hence for quality batsman they could be batting paradises. However, bowlers who are willing to bend their backs find some assistance from these pitches. Pitches here have earned a reputation of helping the quicks somewhat mainly because of the era gone by when West Indies used to have some of the fastest bowlers in cricket and hence the pitches appeared to be faster than they are. Tall bowlers like Malcolm Marshall, Joel Garner, Michael Holding, Andy Roberts, Ian Bishop, Colin Croft, Curtly Ambrose and Courtney Walshproduced bounce and speed even on the most docile pitches that wreaked havoc to any side and they used to run through the line-up. However, some of the best batsmen have arisen from the Caribbean too, like Viv Richards, Gary Sobers, Desmond Haynes, George Headley, Clive Lloyd, Shivnarine Chanderpaul, Rohan Kanhai, Chris Gayle and Brian Lara. Spinners also have something in the pitches as they tend to deteriorate by day four, offering a little dust and cracks for them to exploit. But due to insufficient support to spin in the Caribbean pitches, West Indies has not produced many all-time great spinners with the exception of Lance Gibbs.\n" +
                            "Pitches in Pakistan\n" +
                            "Pitches in Pakistan have historically supported spin bowling rather than seam or swing. However, the conditions in most grounds of Pakistan, like Rawalpindi, Lahore and Peshwarhave also seen support for the reverse swing capabilities of bowlers in past times. The dry and windy conditions usually lend good support to the faster bowlers as well. Such pitches had virtually no grass, afforded little assistance for pace, bounce, or lateral air movement, but created good turn. In decades past spinners toyed with visiting teams to plot dramatic victories for Pakistan in home test matches, particularly on turning pitches in hot, humid conditions at Arbab Niaz Stadium and Gaddafi Stadium. Pitches in Pakistan are flat and considered favourable for batsmen in winter; they suit spinners in summers.\n" +
                            "Pitches in Bangladesh\n" +
                            "The Bangladeshi wickets receive a lot of rain fall in little time which reflects the soggy nature. The conditions vary from grounds like Sher-e-Bangla Cricket Stadium and Chittagong Divisional Stadium. The basic idea of producing wickets in Bangladesh is to avoid using grassroots when they are building up the layers of soil. The roots hold the water and retain moisture for an extended period. It helps bind the wicket better, making it a harder surface eventually. It also slows the process of wearing down.[8]\n" +
                            "Pitches in Sri Lanka\n" +
                            "Pitches are generally dusty and shorn off grass; the rain here also makes for a \"sticky wicket\". Wickets are generally flat and don't offer much bounce – however, the pitch at Asgiriya Stadium, Kandy offers generous bounce and favours fast bowling.[9] Bowlers get help under the lights. Spin is the key in these conditions, and spinners have fine records on the pitches in Sri Lanka. The heat requires an extreme level of fitness, while sweaty clothing makes it difficult to shine the ball. Reverse swing, off-spin, leg-spin are all effective tools in such conditions.\n" +
                            "Pitches in Zimbabwe\n" +
                            "Pitches in Zimbabwe closely resemble those in South Africa with the main difference being in the nature of the bounce. The pitches in South Africa provide fast bounce while the pitches in Zimbabwe tend to have a spongy, tennis ball type of bounce, which makes hitting on the up a risky proposition. Most pitches have slower bounce, hence batting is more favourable in Zimbabwe.\n" +
                            "Conditions at the Queens Sports Club, Bulawayo tend to aid batsmen, with spin coming into the game in a big way in the latter stages. The pitch has some grass, though not green enough to leave batsmen anxious. With the temperature touching 28 degrees, the strip is expected to dry out quickly and flatten into a batting beauty. The seamers' best chance will be with the new ball, and both teams feel keen to make first use of the pitch.[10]\n" +
                            "Pitches in UAE\n" +
                            "The UAE features spin-friendly pitches. New ball helps the bowlers and bowlers eye reverse swing and spin with the older ball. UAE conditions differ significantly from those of Pakistan due to the Gulf's sandy soils. Grounds are not that hard. Dubai Cricket Stadium offers some grass and bounce though dry conditions tend to result in the fourth and fifth days of a test match being spin friendly. Sheikh Zayed Stadium is batting-friendly, and the cracks come very late into play.\n" +
                            "The guidelines for rating a pitch 'dangerous' or 'unfit'\n" +
                            "Here is how the International Cricket Council rates pitches and deems them unfit to play on, effective January 2018. There are certain conditions that the ICC has laid out in order for a pitch to meet their requirements. They are listed below:[11]\n" +
                            "The objective of a Test pitch shall be to allow all the individual skills of the game to be demonstrated by the players at various stages of the match. If anything, the balance of the contest between bat and ball in a Test match should slightly favour the bowling team.\n" +
                            "A pitch should be expected to deteriorate as the match progresses, and as a consequence, the bounce could become more inconsistent, and the ball could deviate more (seam and spin) off the wearing surface.\n" +
                            "The pitches can be rated:\n" +
                            "Very Good: (if there is) Good carry, limited seam movement and consistent good bounce early in the match and as the pitch wears as the match progresses, with an acceptable amount of turn on the first two days but natural wear sufficient to be responsive to spin later in the game\n" +
                            "Good: (if there is) Average carry, moderate seam movement and consistent bounce both early in the match and as the pitch wears as the match progresses, natural wear sufficient to be responsive to spin from day 1, though not quite meeting the criteria for carry and bounce for a \"very good\" pitch.\n" +
                            "Average: (If it) Lacks carry, and/or bounce and/or occasional seam movement, but consistent in carry and bounce. A degree of turn, but with average bounce for the spinner. Falling significantly short of \"very good\" with respect to carry, bounce and turn.\n" +
                            "Below Average: (If there is) Either very little carry and/or bounce and/or more than occasional seam movement, or occasional variable (but not excessive or dangerous) bounce and/or occasional variable carry. If a pitch demonstrates these features, then the pitch cannot be rated in a higher category regardless of the amount of turn the pitch displays at any stage of the match.\n" +
                            "Poor: A Poor pitch is one that does not allow an even contest between bat and ball, either by favouring the batters too much, and not giving the bowlers (seam and spin) from either team sufficient opportunity to take wickets, or by favouring the bowlers too much (seam or spin), and not giving the batters from either team the opportunity to make runs. If any of the following criteria apply, a pitch may be rated \"poor\":\n" +
                            "\uF0B7The pitch offers excessive seam movement at any stage of the match.\n" +
                            "\uF0B7The pitch displays excessive unevenness of bounce for any bowler at any stage of the match.\n" +
                            "\uF0B7The pitch offers excessive assistance to spin bowlers, especially early in the match.\n" +
                            "\uF0B7The pitch displays little or no seam movement or turn at any stage in the match together with no significant bounce or carry, thereby depriving the bowlers of a fair contest between bat and ball.\n" +
                            "\uF0B7The pitch offers excessive assistance to spin bowlers, especially early in the match.\n" +
                            "Unfit: A pitch may be rated 'unfit' if it is dangerous.\n" +
                            "\uF0B7It is recognised that a limited amount of seam movement is acceptable early in the match and that a pitch may develop some unevenness of bounce for seam bowlers as the match progresses. This is acceptable, but should not develop to a point where they would be described as \"excessive\".\n" +
                            "\uF0B7It is acceptable for a pitch to offer some degree of turn on the first day of a match, particularly in the sub-continent, though anything more than occasional unevenness of bounce at this stage of the match is not acceptable. It is to be expected that a pitch will turn steadily more as a match progresses, and it is recognised that a greater degree of unevenness of bounce may develop.\n" +
                            "\uF0B7It is impossible to quantify the amount that a ball is \"allowed\" to turn as bowlers will turn the ball differing amounts. The type and identity of bowler shall be taken into account when assessing this factor.\n" +
                            "\uF0B7In no circumstances should the pitch 'explode'.\n" +
                            "Dangerous Pitch (Changing the pitch)\n" +
                            "\uF0B7If the On-field umpires decide that It is dangerous or unreasonable for play to continue on the match pitch, they shall stop the play immediately & advice the ICC match referee.\n" +
                            "\uF0B7The On-field umpires and the ICC match referee then consult with both the captains.\n" +
                            "\uF0B7If the captains agree to continue, play shall resume.\n" +
                            "\uF0B7If the decision is no to resume play, the On-field umpires together with the ICC match referee shall consider whether the existing pitch can be repaired and the match resumed from the point it was stopped.\n" +
                            "\uF0B7If the decision is that it can’t be repaired, then the match is to be abandoned as a draw.\n" +
                            "Drop-in pitches\n" +
                            "A drop-in pitch is a pitch that is prepared away from the ground or venue in which it is used, and \"dropped\" into place for a match to take place. This allows multi-purpose venues to host other sports and events with more versatility than a dedicated cricket ground would allow.[12]\n" +
                            "They were first developed by WACA curator John Maley for use in the World Series Cricket matches, set up in the 1970s by Australian businessman Kerry Packer. Drop-in pitches became necessary for the World Series as they had to play in dual purpose venues operating outside of the cricket establishment.[13] Along with other revolutions during the series including the white ball, floodlights, helmets, and coloured clothing, drop-in pitches were designed to also make games more interesting. They would start off bowler friendly seaming and spinning with uneven bounce for the first two days of a game. After that they became extremely easy for batting meaning high targets were chaseable on the fourth and fifth days, although there would still be something in the pitch for the bowlers.\n" +
                            "In 2005, the Brisbane Cricket Ground (the \"Gabba\") rejected the use of a drop-in pitch, despite requests from the ground's other users, the Brisbane Lions AFL team. Although drop-in pitches are regularly used in the Melbourne Cricket Ground and in New Zealand, Queensland Cricket stated that Brisbane's weather and the difference in performance meant they preferred to prepare the ground in the traditional way.[14]\n" +
                            "Plans to use drop-in pitches in baseball parks in the United States have met with problems due to strict rules about transporting soil over state lines. It has been found that the best soil types for drop-in pitches are not located in the same states which have been targeted by cricketing authorities—New York, California and Florida.[15]\n";
                }
                else if(myListView.getItemAtPosition(position).toString().trim().equals("MusicVoiceCulture")){
                    //setting value of the paragraph string
                    paragraph = "Voice culture primarily refers to the methodology adopted to train or control the voice to sing effectively. Many musicologists and voice experts have accepted it as science. According to one of the voice experts Dr. T. Unnikrishnan, technique of voice culture is a branch of knowledge, which deals with the techniques of  right voice production.\n" +
                            "\n" +
                            "Fundamentally, it is the coming together of an understanding of science with the physical feel of the voice. Culturing or nurturing the voice is essential for a singer of any level-be it a beginner or a seasoned artist. Voice culturing is basically a method of training the voice to project it effectively, using the whole body as a musical instrument with voice modulation, breath control techniques, effective pronunciation etc. The voice needs to be understood and taken care of as a child and has to be nourished to strengthen it by reducing the shortcomings and enhance the impressive traits.\n" +
                            "\n" +
                            "When a musician sings in the correct tone, the whole environment becomes spiritual and soothing. For the tone to touch the hearts of the listeners, the primary medium is the voice, which is the amalgam of sound and mechanics. Two important factors for a good musician are good voice and sound musical knowledge. A vocal musician has to exercise his/her vocal chords to bring them under their command of musical impulses of the brain. Practice of such exercises to make the vocal chords music worthy is called saadhana or riyaz. A beginner would be more focused on the singing in tune, understanding the concept of pitch, being able to sustain notes in adherence to shruti without wavering, ability to render gamakas with control and mastering the speed, ability to traverse various octaves, correct articulation of sahitya and so on. The voice building exercise is similar to body building exercise. The voice has to be nurtured carefully to maintain its dexterity until it becomes supple enough to reproduce what is intended to sing as the voice is the amalgamation of sound and mechanics.\n" +
                            "\n" +
                            "Factors that influence effective singing\n" +
                            "Flexibility – The vocal mechanism and speech organ must be flexible enough to enunciate the words and to produce different musical phrases\n" +
                            "\n" +
                            "Shape of the mouth – Important for correct pronunciation\n" +
                            "\n" +
                            "Vocal range – Varies from person to person, however, range is limited for speech than singing. Minimum traversable range for an individual is two and a half octaves.\n" +
                            "\n" +
                            "Speed – Agility of the vocal chords to produce musical phrases in any tempo influence the quality of singing\n" +
                            "\n" +
                            "Volume – Appropriate loudness to reach the audience, without compromising on the tonal quality and the bhava aspects\n" +
                            "\n" +
                            "Imagination – Mental perception of the words and tone are important to render a note or word effectively. Creativity in the musical phrases plays a very important role.\n" +
                            "\n" +
                            "Vocal pedagogists explain the importance of vocal exercises, which include:\n" +
                            "\n" +
                            "Warm up the voice to extend the vocal range\n" +
                            "Train to sing wide intervals comfortably\n" +
                            "Correcting the vocal faults\n" +
                            "Effective breath control\n" +
                            "Flexible speech organs\n" +
                            "Wider vocal range\n" +
                            "Controlling the volume as the context of presentation demands\n" +
                            "Vowel pronunciation\n" +
                            "It may be stated here that language, culture and civilization have a direct influence on the quality of the voice. Language and speech affect the way a vowel or consonant is pronounced. Some use more of the nasal tone when speaking, like in Malayalam language, while others use rounded consonants and tone, like in Bengali language.\n" +
                            "\n" +
                            "Factors that affect the voice quality\n" +
                            "There are several factors that affect the voice quality when singing. One should be cautious of them and pay deliberate attention, especially during the time leading up to a performance.\n" +
                            "\n" +
                            "Physical condition of the body – which may affect the tonal quality and strength\n" +
                            "Articulation, rate of speech, intonation and pauses\n" +
                            "Breathing pattern\n" +
                            "Emotional condition\n" +
                            "External factors like air quality, humidity, noise\n" +
                            "Speaker-listener distance\n" +
                            "Hormonal changes\n" +
                            "Fatigue and stress\n" +
                            "Age and any medications\n" +
                            "Techniques to maintain the voice quality\n" +
                            "Breath control\n" +
                            "Control of breath offers clarity, steadiness and confident phonation to the voice. It is recommended to sing using abdominal breathing while singing lower notes to make the base swaras weighty. Intensity of the voice depends on the force given to the breath while singing.\n" +
                            "Key to controlling the volume while singing is controlling the breathing. The diaphragm beneath the lungs help in controlling the amount of air that is exhaled when singing.\n" +
                            "Understanding the production of tones across the range, understanding the breathing pattern\n" +
                            "Efficient usage of the tongue for correct pronunciation\n" +
                            "Exercise regularly to maintain fitness and develop the ability to hold onto a swara or phrase for longer duration without shaking it.\n" +
                            "Choose the correct shruti/pitch suitable to the voice. This plays a major role in voice health so as to avoid strain over longer duration.\n" +
                            "Open and free voice production is suitable for effective rendition and the music to touch the heart of the listener.\n" +
                            "Vocal pedagogists say that any musician who adopts the right vocal techniques will find the abdominal muscles around the navel strained rather than the vocal chords.\n" +
                            "Voice modulation is necessary to reduce the strain on the vocal chords. Modulation does not mean using false voice. Soften the voice to reduce the stress. Using false voice may help in effortless singing but will not create the right impact on the listener.\n";
                }
                else if(myListView.getItemAtPosition(position).toString().trim().equals("MusicInIndia")){
                    //setting value of the paragraph string
                    paragraph = "\n" +
                            "\n" +
                            "STYLES AND TYPES OF INDIAN MUSIC\n" +
                            "\n" +
                            " There are two main schools of Indian classical music: the Hindustani style of the North and the Karnatak (also spelled Karnatak and Karanatic) of the South. The Hindustani style features a number of Turko-Persian musical elements not found in the more varied and, in some ways, complex Karnatak style. Well-known Hindustani styles include Dhrupad, Dhamar, Khayal, Tappa and Thumri. [Main Source for this article: Rough Guide of World Music]\n" +
                            "\n" +
                            " A gharana (literally meaning \"extended family\") is a school of music. Certain ones have good reputations. Gharanas are more like philosophical schools than formal institutions. There are ones for singing and various instruments and they often distinguished by style and mode of thought. They have usually been founded by famous musicians.\n" +
                            "\n" +
                            " Traditionally musical traditions have been passed on orally and musical skills have often been taught from father to son or teacher to pupil. Students pay respect to their instructors by kissing their feet. The relationship between teachers (known as pandits and gurus among Hindus and ustaad among Muslims) and their pupils is very important in Indian music. Teachers and pupils are often related, and the spiritual element of the instrument is often as important as technical virtuosity. In northern India, the spiritual relationship is symbolized by a ceremony in which a teachers ties a string around the wrist of a pupil.\n" +
                            "\n" +
                            " Some styles of Indian music are associated with a specific faith. Bhajans and kirtis, for example, are Hindu devotional songs; and qawali is a form rooted in Sufi Islam. As a rule Hindu styles are performed by Hindu performers and Islamic styles are performed by Muslim performers.\n" +
                            "\n" +
                            "\n" +
                            "Hindustani Music\n" +
                            " Hindustani Music is the term used to describe the music of northern India, which is regarded by many people as true Indian music. Influenced by music from Persia and Central Asia, it also refers to vocal styles mentioned below: dhrupad, khyal, dadra and thumri. Music from southern India. features shorter pieces without the long, slow tempo phases. Even though it is less well known in the West it arguably is more accessible to Western ears. [Source: Rough Guide of World Music]\n" +
                            "\n" +
                            " Music from the north can be divided into two types: 1) classical and 2) light classical (also referred to as semi-classical). The classical form requires stricter adherence to the raga formula while light classical allows more opportunities for deviations and does not require the intense concentration that classical Indian music requires.\n" +
                            "\n" +
                            " Light classical music is defined as a style of music that follows the rules of raag and taal but adheres to them less strictly than with classical music. The alaap is usually very short or doesn't exist and the melodies are often derived from popular folk music and are rendered in medium ( madhya kaal) or fast ( teevra gati) tempo. Types of light classical music include jugalbandi, an instrumental duet. Dadra, thumri, ghazal and qawwali refer to light classical singing styles as well as music styles (See Below).\n" +
                            "\n" +
                            " Classical ragas have gone though changes similar to those of classical Western music. Alaaps have been shortened. Popular ragas are heard over and over again in easily digestible forms.\n" +
                            "\n" +
                            "\n" +
                            "Karnatak\n" +
                            " Karnatak (also spelled Karnatak and Karanatic) is the classical music of southern India. It is similar to Hindustani classical music except it is freer and has a more positive and upbeat mood that reflects a lack of influence of music from Persia and Central Asia and the fact it has remained close to its Hindu origins. Purandara Dasa is regarded as the Father of Karnatak music. [Source: Rough Guide of World Music]\n" +
                            "\n" +
                            " The structure of Karnatak is similar to that of Hindustani music. Both have ragas (in Karnatak they are called ragams) but the rhythms, musical instruments and melodies used in Karnatak are different from those used in Hindustani. With Karnatak music there is more emphasis on vocal music and the music itself is freer, more complex and more open to improvisation. The thaalam (the equivalent of the taal) is especially rich and complex. During concerts you will often see people in the audience “keeping the tala,” marking the time cycle with hand and finger counts.\n" +
                            "\n" +
                            " Compared to Hindustani music, music from southern India features shorter pieces without the long, slow tempo phases. Even though it is less well known in the West it arguably is more accessible to Western ears. Spirituality and devotion are key to understanding Karnatak music. The lyrics to all the famous traditional pieces are devotional and philosophical in nature and their composers—Tyagaraja (1767-1846), Mutuswamy Dikshitar (1776-1835) and Syama Sastri (1762-1827)— are regarded as saints. The music itself is comprised of 62 Melkarta Ragams, which are composed by seven notes. Seven different “Sapta Talas” provide the basis for rhythm.\n" +
                            "\n" +
                            " A typical Karnatak classical vocal performance begins with a varnum (a composition with three parts: pallavi, anupallavu and chittaswaram), dedicated to Ganesh, followed by one or two short tempo-building kriti (songs, See Below), which in turn are followed by an alppana (the Karnatak equivalent of the alaap) and thaalam (the equivalent of a jor) The singer sings without words, concentrating on the notes of the raga, improvising within its structure. A performance might end with a light classical piece such as a ragamalika, bhajan or thirupugazh.\n" +
                            "\n" +
                            "Karnatak musical instruments, See Below\n" +
                            "\n" +
                            "\n" +
                            "Dhrupad\n" +
                            " Dhrupad is the most austere form of classical singing and playing. Closely connected to the famous Mughal singer Tansen, it is a northern Indian style that features a straight delivery and no embroidery or embellishment. Singers are accompanied by a tanpura and pakhawaj barrel drum. Performance begins with a long, complex alaap and focuses more on the nuances of the raga and the text and less on technical feats. Dhamar is a form similar to dhrupad but has more embellishments. [Source: Rough Guide of World Music]\n" +
                            "\n" +
                            " Dhrupad is regarded as a sacred art. Ramakant Gundecha, a Dhrupad performer told the Asahi Shimbun, “It is s a music of peace. It has its roots in the Vedas. As it is prayer music that used to be sung in Hindu temples, it addresses the gods.” Dhrupad was played in the courts of the maharajas and was patronized by the Mughals.\n" +
                            "\n" +
                            " Describing the dhrupad singer F Wasifuddin Dagar, Mark Jenkins wrote in the Washington Post, \"He began the piece with a slow, meditative chant that was only slightly more assertive than the external drone of the two tanpura players who accompanied him. By the time the 90-minute raga ended, he conjured an entire orchestra....The singer employed a call-and-response style in which his voice produced dueling tones: It was alternatively high and throaty, clear, distorted, sustained and staccato.\"\n" +
                            "\n" +
                            " A Dhrupad performance often puts more emphasis on the alaap (introductory part of the music) than the raga. Gundecha said, “The alap of Dhrupad is fully based on improvisation. The singer behaves as a composer, conductor and performer. We are free to express ourselves within the periphery of the stylistic characteristics...We unfold the melody step by step with increasing tempo.”\n" +
                            "\n" +
                            "\n" +
                            "Khayal and Thumri\n" +
                            " Khayal (also spelled khyal, derived rom a Persian word meaning \"imagination\") is a form of classical singing that is less austere and more popular today than Dhrupad. It features elaborate embroidery and embellishments The singer begins with a short alaap in which the characteristics of the raga are developed. No words are sung: the singer concentrates on the notes of the raga while improvising within its structures. Each phase that the singer sings may repeated by the accompanist. [Source: Rough Guide of World Music]\n" +
                            "\n" +
                            " Khayals are fixtures of Hindustani light classical pieces. A bandish (Bada Khayal) is often the first composition to begin after the raga has been properly introduced. The tabla meter is often very very slow—with one cycle of the taal taking take a minuet or more to complete. Most of the music is improvised. The composition acts as a refrain for the improvised material.\n" +
                            "\n" +
                            " Thumri is another fixture of Hindustani light classical music. Created by Nawab Ali Shah, who governed Lucknow from 1847 to 1856, it is an emotional song style known for its graceful, lyrical melodies. It s regarded as more accessible than dhrupad or khayal and features ragas and taals usually associated with kathak dance. Dadri, Hori, Chaiti, Kajri and Jhool are sub genres of Thumri.\n" +
                            "\n" +
                            " Thumri is primarily a vocal style of romance music written from the perspective of the woman and sung in a literary dialect of Hindi called Braj Bhasha. In the old days it was often associated with court courtesans and prostitutes. Despite the feminine orientation, some of the most famous thumri singers are men such as Ustad Bade Ghulam Ali Khan, an overweight, middle aged Muslim who sang about \"bracelets slipping off\" and being “struck with his magic.\"\n" +
                            "\n" +
                            "\n" +
                            "Hindu Devotional Music\n" +
                            " Bhajans are forms of devotional songs that are especially popular in northern India. They often honor a particular deity or recall an episode from Hindu mythology. Pilgrims chant them at festivals and along the banks of the Ganges. They are chanted by worshipers at temples. Many of the compositions date back to the period of the Hindu reformation in A.D. first millennium, when Hinduism reestablished itself after a period when Buddhism was dominant. Bhajans have also been influenced by Sufi devotional music. [Source: Rough Guide of World Music]\n" +
                            "\n" +
                            " Kriti is the most important from of devotional music from southern India. Often based on religious text and performed at temples, it pantheon of deities. . Other vocal styles associated with southern India include bhajan (Hindu devotional love songs), ragamalika (a series of ragas), or thirupugazh. .\n" +
                            "\n" +
                            "\n" +
                            "Ghazal\n" +
                            " A ghazal is a light style of classical Persian love music adored by the Mughals. Originally more of a poetic than musical form, the name is derived from an Arabic word meaning \"to talk amorously to women.\" Although sometimes referred to as the Urdu equivalent of khayal, it is based as often on folk melodies as on ragas. The lyrics are often taken from famous Urdu poems. Famous ghazal singers are mostly women. They include Shabha Urtu, Najma Akhtar and Begum Akhtra (1914-1974). [Source: Rough Guide of World Music]\n" +
                            "\n" +
                            " Ghazals are also performed in Central Asia, Iran and Turkey. In India they often heard on the radios or in films popular in northern India. But they are most often associated with court music from the Mughal Golden Age. These songs were often linked with stories of maharajahs who seduced deadly snakes into performing dances, Mughal shahs who transformed day into night with their songs and musicians who calmed rampaging elephants.\n" +
                            "\n" +
                            " Some ghazal stick close to the raga format. Others bring folk rhythms to the forefront and verge on being pop songs. Essential elements found in Ghazal are shayari (“eloquent poetry”), mausiqui (“gentle music”) and jazbat (“fragile emotions”). The music is very slow paced and the lyrics are repeated two ro three times. The first couplet is a matla. The second couplet is the makta. The remaining couplets are misra and antara.\n" +
                            "\n" +
                            "\n" +
                            "Sufi Devotional Music\n" +
                            " Sufism is a kind of mystical Islam in followers sometimes go into trancelike states. Sufi spiritual music is often highly-syncopated and hypnotic. One Sufi dancer said, \"The music takes you over completely. It's a healing thing.\" The union of the body, spirit and music lies at the heart of Sufism. Sufis believe: \"Music is the food of the spirit; when the spirit receives food, it turns aside from the government of the body.\"\n" +
                            "\n" +
                            " Sufis are credited with keeping the spirit of music alive in the Muslim world while orthodox Muslims tried to stamp it out. Sufis traditionally criticized those who criticized music. According to 9th-century Baghdad philosopher Abu Suliman al-Darani Sufis believe that \"music and singing do not produce in it that which is not in it\" and music \"reminds the spirit of the realm for which it constantly longs.\"\n" +
                            "\n" +
                            " Some Sufi songs are popular villages songs about love with lyrics changed so the Mohammed is the object of love rather than a woman or a man. One songs goes, \"It is he, it is only he who lives in my heart, only he whom I give my love, our beautiful Prophet Mohammed, whose eyes are made-up with kohl,\"\n" +
                            "\n" +
                            " Fixtures of Sufism include secret recitations and annual 40-day retreats known as chilla . Sufi mulids , religious festivals that honor the saints of mosque, sometimes attracts hundreds of thousands of people. Describing a Sufi ritual at such a festival David Lodge wrote in the Rough Guide to World Music: \"To a binding hypnotic rhythm, heaving movements and respiratory groans, the leader conducts the congregation by reciting Sufi poetry, guiding them from one maqam mode to another. Bodies sway, head roll upwards on every stroke as they chant religious devotions with spiraling intensity.\"\n" +
                            "\n" +
                            "\n" +
                            "Qawwali Music\n" +
                            " Qawwali is a kind of Sufi devotional music with a high-pitched and fast-paced stye of singing. It developed in the 13th century when Sufism was becoming popular on the Indian subcontinent. Qawwali literally means \"philosophical utterance\" in Arabic and has come to mean performing Sufi poetry to music. Qawwali songs are based on devotional Sufi poems and often have romantic themes that can be interpreted as love between a devotee and his God or between a man and a woman. [Source: Rough Guide of World Music]\n" +
                            "\n" +
                            " Qawwali has a very distinct sound. The \"sweeping melodies\" and rhythmic hand clapping and the drone of the harmonium is instantly recognizable. It is often featured in Indian films and clubs and gatherings. Describing the appeal of qawwali music, Jon Pareles wrote in the New York Times, it is music \"a rocker could love; it favors rock-hewn, hearty voices and an unstoppable beat.\"\n" +
                            "\n" +
                            " Qawwali music evolved out of Sufi poems and chants of God's name ( zikr) to achieve a trancelike state. The poems are regarded as links to Sufi saints and ultimately to God. The origin of qawwali is attributed to Amir Khusrau (1253-1325), a talented Sufi poet and composer who has also been credited with inventing the sitar and the tabla. He was a disciple of the Delhi-based Sufi saint Nizamuddin Auliya. Poems by Khusrau are the core of the qawwali repertoire. Qawwali music has endured through the tradition of Mahfil-e-Sama (\"Assembly for Listening\"), which remains the central ritual today. The act of listening to music ( sama) is an expression of mystical love and the desire to be unified with the Sufi saints and God.\n" +
                            "\n" +
                            " Qawwali musicians view themselves as religious people entrusted with the responsibility of evoking the name of God. They are trained and led by a religious leader called a sheik and traditionally have performed during ceremonies to mark the death of a saint at the saint's shrine. Qawwali musicians also have traditionally performed at shrines on Thursdays, the day Muslim remember the dead; Friday, the day of congregational prayer; and times when many pilgrims arrive. Musicians who perform at Sufi shrines are often descendants of the saints for which the shrine is dedicated.\n" +
                            "\n" +
                            " Sufism, See Islam factsanddetails.com\n" +
                            "\n" +
                            "\n" +
                            "Qawwali Songs\n" +
                            " Qawwali songs tend to be long and have a structure and organization similar to that of northern Indian music. They feature a singing melodic line supported by drones and rhythms. A typical qawwali song features \"solo verses punctuated by a choral refrain and instrumental interludes.\" Qawwali songs also feature \"a steady, accelerating beat, a refrain that is repeated with increased passion” and “ a voice that roses to joyful, inspired testimonials of faith.\"\n" +
                            "\n" +
                            " Qawwali songs often have a structure defined by strict rules. They usually begin with a slow prelude, featuring the harmonium and drumming. After the prelude ends the singer begin intoning texts quietly as if in payer. As the song the progresses the tempo speeds up with calls of praises of Allah, the Prophet and Sufi saints. This is followed by call-and-response style exchanges between the soloist and the junior singers. The rhythms become more lively and up tempo, building to crescendo-like climax.\n" +
                            "\n" +
                            " Most tradition qawwali songs are written in Persian or an old form of Hindi called Braj Bhasha—the languages used by Khursrau. Many new songs are in Punjabi or Urdu. On the surface many qawwali lyrics seem to be about unrequited love. A closer look reveals that are about longing for god. Both musicians and listeners talk about how the music intoxicates them with divine love. The words to one famous Qawwali song goes: \"I have forsaken all and I stand forlorn at your doorstep/ Just one glance from you would fulfil my life's dream/ Take one look at me, and I'll never look back on the world I have spurned in order to cling to you.”\n" +
                            "\n" +
                            " Songs are often extended with girahs, additional verses added spontaneously in the middle of a song. There is a repertoire of girahs that singer chose from and skilled singers now to thrown in girahs in unexpected way to keep a song fresh. Tarana is a vocalization technique \"using syllables derived from esoteric Sufi tradition.\"\n" +
                            "\n" +
                            "\n" +
                            "Qawwali Music Parties and Performances\n" +
                            " A group that plays qawwali music is called a party. It usually includes a lead singer called a mohri, secondary singers who usually play the harmonium, and at least one percussionist. Every member of the group joins in the singing and the youngest members provide the rhythmic hand claps.\n" +
                            "\n" +
                            " Describing a qawwali performance, Mark Jenkins wrote in the Washington Post, \"The party's lead vocal sang the principal lyrics...His verses were answered by the higher-pitched solo singing of his brother Mehr and the call-and-response and unison of the other eight musicians. While two harmoniums provided the drone.\" The tabla player \"did an exemplary job of keeping and embroidering the beat. Still, much of the evening's music was made simply with trilling voices and clapping hands.\"\n" +
                            "\n" +
                            " Qawwali refers to a performance and singer as well as a kind of music. At a traditional show, the audiences is made up of exclusively men in accordance with Sufi traditions. In the old days, qawwali was performed at a Sufi shrines on important religious days. These days it is performed in the West at concerts and in Pakistan and India at gatherings call mahfils.\n" +
                            "\n" +
                            " Qawwali has traditionally been performed at a mahfil. Mahfils are social events in which the audiences and performers relax in comfortable positions on the floor. There is great deal of communication between the audience and performers, with performers adapting their music and performances to the likes and spiritual needs of the audience. Many Qawwali performs don't like performing in auditoriums because the feel intimacy is compromised there.\n" +
                            "\n" +
                            " At marfils, musicians often direct their music towards an experienced group of senior listeners, who often show their appreciation by throwing money on the stage or handing musicians gifts ( nazir) in appreciation for a particular phrase or riff. These gifts date back to a time when they were the performers principal source of income.\n" +
                            "\n" +
                            "See Mahfil Above\n" +
                            "\n" +
                            "\n" +
                            "Folk Music in India\n" +
                            " There are almost as many different kinds of folk music in India, Pakistan and Bangladesh as there are ethnic groups and cultures. The most well known styles come from Uttar Pradesh, Rajasthan, the Punjab and Bengal. Bengal has a rich tradition of religious folk music, especially associated with Sufism among Muslims and with the devotional worship of Krishna and the goddess Kali among Hindus. Dogri love songs from the Jammu hills and chants from Uttar Pradesh have done well on the World Music charts.\n" +
                            "\n" +
                            " Folk music is often called Desi. It has traditionally been associated with events from everyday life and is often performed at festival and life-cycle events such as marriages and births. It is much more festive, celebratory, for-the-moment and fun than Indian classical music but has suffered as a result of the mass market of Bollywood and Film Music.\n" +
                            "\n" +
                            " Some of the most interesting folk music is music from the tribal areas. The music that comes from tribal areas often more closely resembles the music of Southeast Asia than it does the music associated with India.\n" +
                            "\n" +
                            " Kerala is famous for its ritual drumming featuring chenda drums (hollow meter-long cylindrical drum held like a guitar with a shoulder strap and played standing up), often played with Kuzhai oboes, bronze cymbals and C-shaped kombu horns. Chendra drums are the chief accompaniment for Kathakali and are played in many temples in Kerala. Large drumming groups called chenda melas, play at festivals and other large gatheringa. The performances are exhilarating and entertaining. Sometimes elephant trumpeting is worked into shows and the drumming is so intense and fast it is said to sound like a roaring lion.\n" +
                            "\n" +
                            "See Minorities, Music, Dance\n" +
                            "\n" +
                            "See Weddings\n" +
                            "\n" +
                            "\n" +
                            "Music from Kashmir and Rajasthan\n" +
                            " Chakri is one of the most popular types of traditional music played in Jammu & Kashmir. Chakri is a responsorial song form with instrumental parts, and it is played with instruments like the harmonium, the rubab, the sarangi, the nout, the geger and the chimta. It is performed in folk and religious spheres, by the Muslim and Hindu Kashmiris. Chakri was also used to tell stories like fairy tales or famous love stories. [Source: Wikipedia]\n" +
                            "\n" +
                            " Soofiyna Moosaqi is traditional form of Kashmiri choral music performed by four to five musicians playing traditional Kashmiri musical instruments such as the saze kashmore (a violin-like instrument), the stringed santoor zither, sarang (bowed viol), surnai oboe the Kashmiri sitar and a percussion from loud dhol drums and more subtle dhorkas, a double headed drum made from a hollow tree trunk.\n" +
                            "\n" +
                            " Rajasthan has a very lively folk music scene. Members of the manganiyar, a musician caste, perform at weddings, theater events and other gatherings. A pair of male singers often perform a devotional call-and-response style of wailing accompanied by stringed instruments like the kamayacha, ravanhata (two-string fiddle) and drums. Other musicians include jogis, wandering mystics who play the one-stringed bhapang and bhopa, and epic bards who play the ravanhartha or jantar (a zither supported by two gourds).\n" +
                            "\n" +
                            " The Rajputs love to sing and dance they have songs about everything the monsoon to the trials of everyday life. Their musical instruments include the satara, which is sort of like a bag pipe without the bag. It is a double flute with one flute providing a drone and the other playing the melody. Instead of a bag it is uses the musician’s lungs to supply the drone. The satara is often the instrument of choice among snake charmers of the sapera caste. It and the sumai (oboe) and murali (double clarinet) are the favored instrument of langa, a caste of musicians and camel traders.\n" +
                            "\n" +
                            "\n" +
                            "Bauls and Bengali Folk Music\n" +
                            " Bengali Baul music has found some followers in the world music scene. Western Indo-pop bands such as Fundamental have drown on emotional baul melodies. Bengali singer Paban Das Baul has produced rock-flavored album called Real Sugar that has done well on the World Music charts. Bengal has a rich tradition of religious folk music, especially associated with Sufism among Muslims and with the devotional worship of Krishna and the goddess Kali among Hindus.\n" +
                            "\n" +
                            " Bauls are a religious and cultural group most active in West Bengal in India and Bangladesh. They are known as traveling minstrels who perform ecstatic songs and poems and live an unconventional lifestyle. The term “Baul” is understood to mean “madness.”. The Baul often describe themselves as “crazy for God.” Most Bauls are men who sing their songs while playing instruments such as the harmonium, small cymbals, drums or dotara (two-string lute with a long neck) . Usually the play a gopi yantra (or ektara, a one-stringed instrument ,made from a gourd and split bamboo). [Source: Encyclopedia of World Cultures: South Asia, edited by Paul Hockings, C.K. Hall & Company, 1992]\n" +
                            "\n" +
                            " Bauls fall into three major groups: 1) those with links to Tantric Buddhism and Shaktism (goddess worship), 2) those associated with Bengali Vaishnava (Vishnu worship); and Muslim fakirs. Some Bauls are married and perform daily rites in their homes. Some are ascetics who go through an initiation ritual, and wander the countryside, living in ashrams or monasteries. Bauls often gather in large numbers at festivals known as melas to sing songs and share stories.\n" +
                            "\n" +
                            " Bauls usually dress in orange or saffron, with small bells around the ankles. The often have beards and longhair tied in a topknots. Sometimes they wear rudraksha beads (sacred to the god Shiva). They believe that god dwells within the human body and their songs bring him out. One type of song called sahaja emphasizes spontaneity and attempts to induce a state of ecstacy and creativity.\n" +
                            "\n" +
                            " The Bauls reject caste and Muslim-Hindu religious distinctions and sometimes their way of life embraces Tantric ideas about sexuality. These Bauls believe that god dwells in sexual fluids. There are sexual rituals that unite the male and female essence. Many of their songs contain metaphors for unions of these fluid such a catching fish at high tide and piercing the moon. Baul beliefs are influenced by Tantric Buddhism, Sufism, Kundalini yoga and the Shaktism (the worship of Kali).\n" +
                            "\n" +
                            "\n" +
                            "Bhangra\n" +
                            " Bhangra is a funky, beat-driven style of Punjabi folk dance music. Popular in India and Pakistan and among South Asians in Britain and the United States, it combines traditional Punjabi drum-and-percussion music of field workers with Western dance music \"in every-shifting East-West hybrids.” It is know for driving, danceable rhythms, ecstatic singing and goofy keyboard riffs.\n" +
                            "\n" +
                            " Traditional bhangra music is performed at harvest festivals called bisakh. The name of the music is derived from the word bhang—Punjabi for hemp or marijuana—the crop that was often being harvested. The chanting lyrics are meant to entertain fields works and keep their mind off their work. It often incorporates humorous references to wives and mother-in-laws. Bhangra dancing is very popular and performed during the Baisakhi festival in the Punjab. It is performed by men and is very robust and energetic. Drummers playing dholak drums usually play at the center of the dancers.\n" +
                            "\n" +
                            " The rhythm for the music is intended to match the movement of a reaper with a scythe. It is provided by a dhol, a large barrel drum found in many places in western Asia. It is struck with a stick for the basic rhythm on one side. Complicated cross rhythms are played with the hand on the other side and embellished with rhythms from tablas and dholak drums. Dances were developed to accompany the music.\n" +
                            "\n" +
                            " Around 200 years ago, bhangra became a popular form of entertainment. The dhol was replaced by the dlolak, which is quieter and better suited for playing more complex rhythms. Other instruments such as the alghoza (duct flute), thumbi (one-stringed fiddle), Indian harmonium, santoori were added.\n" +
                            "\n" +
                            "\n" +
                            "Modern Bhangra\n" +
                            " In the 1970s, second- and third-generation young South Asian Britons began playing Bhangra music at parties and clubs and groups began making their own music. The ground breaking recording was the album Teri Chuni De Siare by a group called Alaap, one of many groups in Britain that played for Punjabi immigrants at parties at weddings. They used a violin, accordion, acoustic guitar, dhol and tabla and stayed pretty close to traditional forms.\n" +
                            "\n" +
                            " Over time Alaap and groups like Heera, Premi and Holle Holle began incorporated more modern elements into their music and molding a unique sound. The music because a fixture of all-day or daytimer clubs, geared towards Asian youths, particularly girls, that had trouble getting permission from their tradition-bound parents to go out late at night. It was not long before bhangra concerts were attracting 2,000 people.\n" +
                            "\n" +
                            " As bhangra grew the groups began using electric guitars, synthesizers, Western drum kits and drum machines. By the late 80s, bhanga began showing up in clubs frequented by white and black youths and the London music press began hailing bhangra as a possible next big thing. A lot of modern bhangra has a Jamaican influence, particularly dancehall reggae, and hip-hop influence. Bhangra parties were all the rage at American universities in the early 2000s. Meadow on The Sopranos is shown boogying to it in her car.\n" +
                            "\n" +
                            "\n" +
                            "Kalbelia Folk Songs and Dances of Rajasthan\n" +
                            " In 2010, Kalbelia folk songs and dances of Rajasthan were placed on the UNESCO Representative List of the Intangible Cultural Heritage of Humanity. According to UNESCO: “Songs and dances are an expression of the Kalbelia community’s traditional way of life. Once professional snake handlers, Kalbelia today evoke their former occupation in music and dance that is evolving in new and creative ways. [Source: UNESCO Intangible Cultural Heritage]\n" +
                            "\n" +
                            " Today, women in flowing black skirts dance and swirl, replicating the movements of a serpent, while men accompany them on the khanjari percussion instrument and the poongi, a woodwind instrument traditionally played to capture snakes. The dancers wear traditional tattoo designs, jewellery and garments richly embroidered with small mirrors and silver thread. Kalbelia songs disseminate mythological knowledge through stories, while special traditional dances are performed during Holi, the festival of colours. The songs also demonstrate the poetic acumen of the Kalbelia, who are reputed to compose lyrics spontaneously and improvise songs during performances. Transmitted from generation to generation, the songs and dances form part of an oral tradition for which no texts or training manuals exist. Song and dance are a matter of pride for the Kalbelia community, and a marker of their identity at a time when their traditional travelling lifestyle and role in rural society are diminishing. They demonstrate their community’s attempt to revitalize its cultural heritage and adapt it to changing socioeconomic conditions.\n" +
                            "\n" +
                            "The music and dances were placed on the Representative List of the Intangible Cultural Heritage of Humanity because: 1) Kalbelia folk songs and dances have been creatively adapted by their community of Rajasthani snake handlers to changing socioeconomic circumstances, while maintaining continuity over time and providing them with a strong feeling of identity and pride; 2) The inscription of Kalbelia folk songs and dances on the Representative List could help to raise awareness about the importance of safeguarding intangible cultural heritage by offering an example of a marginalized community’s adaptability and creativity;\n" +
                            "\n" +
                            "\n" +
                            "Sankirtana, Ritual Singing, Drumming and Dancing of Manipur\n" +
                            " In 2013, Sankirtana, ritual singing, drumming and dancing of Manipur was placed on the UNESCO Representative List of the Intangible Cultural Heritage of Humanity. According to UNESCO: “Sankirtana encompasses an array of arts performed to mark religious occasions and various stages in the life of the Vaishnava people of the Manipur plains. Sankirtana practices centre on the temple, where performers narrate the lives and deeds of Krishna through song and dance. In a typical performance, two drummers and about ten singer-dancers perform in a hall or domestic courtyard encircled by seated devotees. [Source: UNESCO Intangible Cultural Heritage]\n" +
                            "\n" +
                            " The dignity and flow of aesthetic and religious energy is unparalleled, moving audience members to tears and frequently to prostrate themselves before the performers. Sankirtana has two main social functions: it brings people together on festive occasions throughout the year, acting as a cohesive force within Manipur’s Vaishnava community; and it establishes and reinforces relationships between the individual and the community through life-cycle ceremonies. It is thus regarded as the visible manifestation of God. The Sankirtana of Manipur is a vibrant practice promoting an organic relationship with people: the whole society is involved in its safeguarding, with the specific knowledge and skills traditionally transmitted from mentor to disciple. Sankirtana works in harmony with the natural world, whose presence is acknowledged through its many rituals.\n" +
                            "\n" +
                            "The singing, dancing and drumming of Manipur were placed on the Representative List of the Intangible Cultural Heritage of Humanity because: 1) Transmitted from generation to generation through formal and traditional education, Sankirtana music and dance reinforce the social and spiritual cohesion among the Vaishnava communities of Manipur; 2) Inscription of Sankirtana on the Representative List could contribute to the visibility of intangible cultural heritage while encouraging intercultural dialogue and promoting respect for cultural diversity;";
                }
                else if(myListView.getItemAtPosition(position).toString().trim().equals("Raagas")){
                    //setting value of the paragraph string
                    paragraph = "Ragas\n" +
                            "Raga can be defined as a combination of few musical notes and is the most fundamental concept in Carnatic music. All compositions and artiste's improvisations that we hear in concert platforms are all raga based. It is always a thrill for a true carnatic rasika to be able to identify and appreciate the ragas being rendered in any concert.\n" +
                            "\n" +
                            "Abheri  \n" +
                            "\n" +
                            "Abhogi  \n" +
                            "\n" +
                            "Ahiri  \n" +
                            "\n" +
                            "Amrithavarshini  \n" +
                            "\n" +
                            "Ananda Bhairavi  \n" +
                            "\n" +
                            "Andolika  \n" +
                            "\n" +
                            "Arabhi  \n" +
                            "\n" +
                            "Asaveri \n" +
                            "\n" +
                            "Atana  \n" +
                            "\n" +
                            "Bageshri  \n" +
                            "\n" +
                            "Bahudari  \n" +
                            "\n" +
                            "Begada \n" +
                            "\n" +
                            "Behag  \n" +
                            "\n" +
                            "Bhairavi \n" +
                            "\n" +
                            "Bhoopalam \n" +
                            "\n" +
                            "Bilahari \n" +
                            "\n" +
                            "Bowli \n" +
                            "\n" +
                            "Brindavana Saranga \n" +
                            "\n" +
                            "Chakravakam \n" +
                            "\n" +
                            "Chala Nattai\n" +
                            "\n" +
                            "Chandrajyoti\n" +
                            "\n" +
                            "Chandrakauns\n" +
                            "\n" +
                            "Charukesi\n" +
                            "\n" +
                            "Darbar \n" +
                            "\n" +
                            "Darbari Kanada  \n" +
                            "\n" +
                            "Desh \n" +
                            "\n" +
                            "Devagandhari\n" +
                            "\n" +
                            "Deva Manohari \n" +
                            "\n" +
                            "Dhanyasi\n" +
                            "\n" +
                            "Dharmavati\n" +
                            "\n" +
                            "Dwijavanti\n" +
                            "\n" +
                            "Gambheera Nattai\n" +
                            "\n" +
                            "Gowlai \n" +
                            "\n" +
                            "Gowri Manohari\n" +
                            "\n" +
                            "Hamir Kalyani\n" +
                            "\n" +
                            "Hamsadwani\n" +
                            "\n" +
                            "Hamsanadam\n" +
                            "\n" +
                            "Hamsanandi\n" +
                            "\n" +
                            "Hari Kambhoji\n" +
                            "\n" +
                            "Hemavati\n" +
                            "\n" +
                            "Hindolam\n" +
                            "\n" +
                            "Huseni\n" +
                            "\n" +
                            "Jaganmohini \n" +
                            "\n" +
                            "Janaranjani \n" +
                            "\n" +
                            "Jayanthashri\n" +
                            "\n" +
                            "Kadanakuthoohalam\n" +
                            "\n" +
                            "Kalavati\n" +
                            "\n" +
                            "Kalyana Vasantham\n" +
                            "\n" +
                            "Kalyani\n" +
                            "\n" +
                            "Kamala Manohari\n" +
                            "\n" +
                            "Kambhoji\n" +
                            "\n" +
                            "Kanada\n" +
                            "\n" +
                            "Kannada \n" +
                            "\n" +
                            "Kannada Gowlai\n" +
                            "\n" +
                            "Kapi\n" +
                            "\n" +
                            "Karaharapriya\n" +
                            "\n" +
                            "Karna Ranjani\n" +
                            "\n" +
                            "Kedara Gowlai\n" +
                            "\n" +
                            "Kedaram\n" +
                            "\n" +
                            "Keeravani\n" +
                            "\n" +
                            "Khamas\n" +
                            "\n" +
                            "Kuntalavarali\n" +
                            "\n" +
                            "Kurinji \n" +
                            "\n" +
                            "Lalitha\n" +
                            "\n" +
                            "Lathangi\n" +
                            "\n" +
                            "Maand\n" +
                            "\n" +
                            "Madhuvanti\n" +
                            "\n" +
                            "Madhyamavati\n" +
                            "\n" +
                            "Malahari\n" +
                            "\n" +
                            "Malayamarutham\n" +
                            "\n" +
                            "Mandari\n" +
                            "\n" +
                            "Manirangu\n" +
                            "\n" +
                            "Mayamalavagowlai\n" +
                            "\n" +
                            "Mohana Kalyani\n" +
                            "\n" +
                            "Mohanam\n" +
                            "\n" +
                            "Mukhari\n" +
                            "\n" +
                            "Nadanamakriya\n" +
                            "\n" +
                            "Nagaswarali\n" +
                            "\n" +
                            "Nalinakanthi\n" +
                            "\n" +
                            "Nasikabhooshani\n" +
                            "\n" +
                            "Natabhairavi\n" +
                            "\n" +
                            "Nattai\n" +
                            "\n" +
                            "Nattai Kurinji\n" +
                            "\n" +
                            "Navarasa Kanada\n" +
                            "\n" +
                            "Nayaki\n" +
                            "\n" +
                            "Neelambari\n" +
                            "\n" +
                            "Neethimathi\n" +
                            "\n" +
                            "Pantuvarali\n" +
                            "\n" +
                            "Poornachandrika\n" +
                            "\n" +
                            "Poorvikalyani\n" +
                            "\n" +
                            "Punnagavarali\n" +
                            "\n" +
                            "Ramapriya\n" +
                            "\n" +
                            "Ranjani\n" +
                            "\n" +
                            "Rasikapriya\n" +
                            "\n" +
                            "Reethigowlai\n" +
                            "\n" +
                            "Revagupti\n" +
                            "\n" +
                            "Revati \n" +
                            "\n" +
                            "Sahana\n" +
                            "\n" +
                            "Sama\n" +
                            "\n" +
                            "Saramati\n" +
                            "\n" +
                            "Saranga\n" +
                            "\n" +
                            "Saraswathi\n" +
                            "\n" +
                            "Saveri\n" +
                            "\n" +
                            "Senjurutti\n" +
                            "\n" +
                            "Shankarabaranam\n" +
                            "\n" +
                            "Shanmukhapriya\n" +
                            "\n" +
                            "Shri Ragam\n" +
                            "\n" +
                            "Simhendramadhyamam\n" +
                            "\n" +
                            "Sindhu Bhairavi\n" +
                            "\n" +
                            "Sivaranjani\n" +
                            "\n" +
                            "Sowrashtram\n" +
                            "\n" +
                            "Sriranjani\n" +
                            "\n" +
                            "Subha Pantuvarali\n" +
                            "\n" +
                            "Suddha Dhanyasi\n" +
                            "\n" +
                            "Suddha Saveri\n" +
                            "\n" +
                            "Sumanesaranjani\n" +
                            "\n" +
                            "Sunadavinodini\n" +
                            "\n" +
                            "Surutti\n" +
                            "\n" +
                            "Thilang\n" +
                            "\n" +
                            "Thodi\n" +
                            "\n" +
                            "Vachaspati\n" +
                            "\n" +
                            "Valaji\n" +
                            "\n" +
                            "Varali\n" +
                            "\n" +
                            "Varamu\n" +
                            "\n" +
                            "Vasantha\n" +
                            "\n" +
                            "Vasanthi\n" +
                            "\n" +
                            "Vijayanagari\n" +
                            "\n" +
                            "Yadukula Kambhoji\n" +
                            "\n" +
                            "Yamuna Kalyani  ";
                }
                else if(myListView.getItemAtPosition(position).toString().trim().equals("Football")){
                    //setting value of the paragraph string
                    paragraph = "Football, also called association football or soccer, game in which two teams of 11 players, using any part of their bodies except their hands and arms, try to maneuver the ball into the opposing team’s goal. Only the goalkeeper is permitted to handle the ball and may do so only within the penalty area surrounding the goal. The team that scores more goals wins.\n" +
                            "\n" +
                            "Football is the world’s most popular ball game in numbers of participants and spectators. Simple in its principal rules and essential equipment, the sport can be played almost anywhere, from official football playing fields (pitches) to gymnasiums, streets, school playgrounds, parks, or beaches. Football’s governing body, the Fédération Internationale de Football Association (FIFA), estimated that at the turn of the 21st century there were approximately 250 million football players and over 1.3 billion people “interested” in football; in 2010 a combined television audience of more than 26 billion watched football’s premier tournament, the quadrennial month-long World Cup finals.\n" +
                            "\n" +
                            "For a history of the origins of football sport, see football.\n" +
                            "History\n" +
                            "The early years\n" +
                            "Modern football originated in Britain in the 19th century. Since before medievaltimes, “folk football” games had been played in towns and villages according to local customs and with a minimum of rules. Industrialization and urbanization, which reduced the amount of leisure time and space available to the working class, combined with a history of legal prohibitions against particularly violent and destructive forms of folk football to undermine the game’s status from the early 19th century onward. However, football was taken up as a winter game between residence houses at public (independent) schools such as Winchester, Charterhouse, and Eton. Each school had its own rules; some allowed limited handling of the ball and others did not. The variance in rules made it difficult for public schoolboys entering university to continue playing except with former schoolmates. As early as 1843 an attempt to standardize and codify the rules of play was made at the University of Cambridge, whose students joined most public schools in 1848 in adopting these “Cambridge rules,” which were further spread by Cambridge graduates who formed football clubs. In 1863 a series of meetings involving clubs from metropolitan London and surrounding counties produced the printed rules of football, which prohibited the carrying of the ball. Thus, the “handling” game of rugby remained outside the newly formed Football Association (FA). Indeed, by 1870 all handling of the ball except by the goalkeeper was prohibited by the FA.\n" +
                            "The new rules were not universally accepted in Britain, however; many clubs retained their own rules, especially in and around Sheffield. Although this northern English city was the home of the first provincial club to join the FA, in 1867 it also gave birth to the Sheffield Football Association, the forerunner of later county associations. Sheffield and London clubs played two matches against each other in 1866, and a year later a match pitting a club from Middlesex against one from Kent and Surrey was played under the revised rules. In 1871 15 FA clubs accepted an invitation to enter a cup competition and to contribute to the purchase of a trophy. By 1877 the associations of Great Britain had agreed upon a uniform code, 43 clubs were in competition, and the London clubs’ initial dominance had diminished.\n" +
                            "Professionalism\n" +
                            "The development of modern football was closely tied to processes of industrialization and urbanization in Victorian Britain. Most of the new working-class inhabitants of Britain’s industrial towns and cities gradually lost their old bucolic pastimes, such as badger-baiting, and sought fresh forms of collectiveleisure. From the 1850s onward, industrial workers were increasingly likely to have Saturday afternoons off work, and so many turned to the new game of football to watch or to play. Key urban institutions such as churches, trade unions, and schools organized working-class boys and men into recreational football teams. Rising adult literacy spurred press coverage of organized sports, while transport systems such as the railways or urban trams enabled players and spectators to travel to football games. Average attendance in England rose from 4,600 in 1888 to 7,900 in 1895, rising to 13,200 in 1905 and reaching 23,100 at the outbreak of World War I. Football’s popularity eroded public interest in other sports, notably cricket.\n" +
                            "Leading clubs, notably those in Lancashire, started charging admission to spectators as early as the 1870s and so, despite the FA’s amateurism rule, were in a position to pay illicit wages to attract highly skilled working-class players, many of them hailing from Scotland. Working-class players and northern English clubs sought a professional system that would provide, in part, some financial reward to cover their “broken time” (time lost from their other work) and the risk of injury. The FA remained staunchly elitist in sustaining a policy of amateurismthat protected upper and upper-middle class influence over the game.\n" +
                            "The issue of professionalism reached a crisis in England in 1884, when the FA expelled two clubs for using professional players. However, the payment of players had become so commonplace by then that the FA had little option but to sanction the practice a year later, despite initial attempts to restrict professionalism to reimbursements for broken time. The consequence was that northern clubs, with their large supporter bases and capacity to attract better players, came to prominence. As the influence of working-class players rose in football, the upper classes took refuge in other sports, notably cricket and rugby union. Professionalism also sparked further modernization of the game through the establishment of the Football League, which allowed the leading dozen teams from the North and Midlands to compete systematically against each other from 1888 onward. A lower, second division was introduced in 1893, and the total number of teams increased to 28. The Irish and Scots formed leagues in 1890. The Southern League began in 1894 but was absorbed by the Football League in 1920. Yet football did not become a major profit-making business during this period. Professional clubs became limited liability companies primarily to secure land for gradual development of stadium facilities. Most clubs in England were owned and controlled by businessmen but shareholders received very low, if any, dividends; their main reward was an enhanced public status through running the local club.\n" +
                            "Later national leagues overseas followed the British model, which included league championships, at least one annual cup competition, and a hierarchy of leagues that sent clubs finishing highest in the tables (standings) up to the next higher division (promotion) and clubs at the bottom down to the next lower division (relegation). A league was formed in the Netherlands in 1889, but professionalism arrived only in 1954. Germany completed its first national championship season in 1903, but the Bundesliga, a comprehensive and fully professional national league, did not evolve until 60 years later. In France, where the game was introduced in the 1870s, a professional league did not begin until 1932, shortly after professionalism had been adopted in the South American countries of Argentina and Brazil.\n" +
                            "International organization\n" +
                            "By the early 20th century, football had spread across Europe, but it was in need of international organization. A solution was found in 1904, when representatives from the football associations of Belgium, Denmark, France, the Netherlands, Spain, Sweden, and Switzerland founded the Fédération Internationale de Football Association (FIFA).\n" +
                            "Although Englishman Daniel Woolfall was elected FIFA president in 1906 and all of the home nations (England, Scotland, Ireland, and Wales) were admitted as members by 1911, British football associations were disdainful of the new body. FIFA members accepted British control over the rules of football via the International Board, which had been established by the home nations in 1882. Nevertheless, in 1920 the British associations resigned their FIFA memberships after failing to persuade other members that Germany, Austria, and Hungaryshould be expelled following World War I. The British associations rejoined FIFA in 1924 but soon after insisted upon a very rigid definition of amateurism, notably for Olympic football. Other nations again failed to follow their lead, and the British resigned once more in 1928, remaining outside FIFA until 1946. When FIFA established the World Cup championship, British insouciance toward the international game continued. Without membership in FIFA, the British national teams were not invited to the first three competitions (1930, 1934, and 1938). For the next competition, held in 1950, FIFA ruled that the two best finishers in the British home nations tournament would qualify for World Cup play; England won, but Scotland (which finished second) chose not to compete for the World Cup.\n" +
                            "Despite sometimes fractious international relations, football continued to rise in popularity. It made its official Olympic debut at the London Games in 1908, and it has since been played in each of the Summer Games (except for the 1932 Games in Los Angeles). FIFA also grew steadily—especially in the latter half of the 20th century, when it strengthened its standing as the game’s global authority and regulator of competition. Guinea became FIFA’s 100th member in 1961; at the turn of the 21st century, more than 200 nations were registered FIFA members, which is more than the number of countries that belong to the United Nations.\n" +
                            "The World Cup finals remain football’s premier tournament, but other important tournaments have emerged under FIFA guidance. Two different tournaments for young players began in 1977 and 1985, and these became, respectively, the World Youth Championship (for those 20 years old and younger) and the Under-17 World Championship. Futsal, the world indoor five-a-side championship, started in 1989. Two years later the first Women’s World Cup was played in China. In 1992 FIFA opened the Olympic football tournament to players aged under 23 years, and four years later the first women’s Olympic football tournament was held. The World Club Championship debuted in Brazil in 2000. The Under-19 Women’s World Championship was inaugurated in 2002.\n" +
                            "\n" +
                            "FIFA membership is open to all national associations. They must accept FIFA’s authority, observe the laws of football, and possess a suitable football infrastructure (i.e., facilities and internal organization). FIFA statutes require members to form continental confederations. The first of these, the Confederación Sudamericana de Fútbol (commonly known as CONMEBOL), was founded in South America in 1916. In 1954 the Union of European Football Associations (UEFA) and the Asian Football Confederation (AFC) were established. Africa’s governing body, the Confédération Africaine de Football (CAF), was founded in 1957. The Confederation of North, Central American and Caribbean Association Football (CONCACAF) followed four years later. The Oceania Football Confederation (OFC) appeared in 1966. These confederations may organize their own club, international, and youth tournaments, elect representatives to FIFA’s Executive Committee, and promote football in their specific continents as they see fit. In turn, all football players, agents, leagues, national associations, and confederations must recognize the authority of FIFA’s Arbitration Tribunal for Football, which effectively functions as football’s supreme court in serious disputes.\n" +
                            "Until the early 1970s, control of FIFA (and thus of world football) was firmly in the hands of northern Europeans. Under the presidencies of the Englishmen Arthur Drewry (1955–61) and Stanley Rous (1961–74), FIFA adopted a rather conservativepatrician relationship to the national and continental bodies. It survived on modest income from the World Cup finals, and relatively little was done to promote football in developing countries or to explore the game’s business potential within the West’s postwar economic boom. FIFA’s leadership was more concerned with matters of regulation, such as confirming amateur status for Olympic competition or banning those associated with illegal transfers of players with existing contracts. For example, Colombia (1951–54) and Australia (1960–63) were suspended temporarily from FIFA after permitting clubs to recruit players who had broken contracts elsewhere in the world.\n" +
                            "Growing African and Asian membership within FIFA undermined European control. In 1974 Brazilian João Havelange was elected president, gaining large support from developing nations. Under Havelange, FIFA was transformed from an international gentlemen’s club into a global corporation: billion-dollar television deals and partnerships with major transnational corporations were established during the 1980s and ’90s. While some earnings were reinvested through FIFA development projects—primarily in Asia, Africa, and Central America—the biggest political reward for developing countries has been the expansion of the World Cup finals to include more countries from outside Europe and South America.\n" +
                            "Greater professionalization of sports also forced FIFA to intercede in new areas as a governing body and competition regulator. The use of performance-enhancing drugs by teams and individual players had been suspected since at least the 1930s; FIFA introduced drug tests in 1966, and occasionally drug users were uncovered, such as Willie Johnston of Scotland at the 1978 World Cup finals. But FIFA regulations were tightened in the 1980s after the sharp rise in offenses among Olympic athletes, the appearance of new drugs such as the steroid nandrolone, and the use of drugs by stars such as Argentina’s Diego Maradona in 1994. While FIFA has authorized lengthy worldwide bans of players who fail drug tests, discrepancies remain between nations and confederations over the intensity of testing and the legal status of specific drugs.\n" +
                            "\n" +
                            "As the sport moved into the 21st century, FIFA came under pressure to respond to some of the major consequences of globalization for international football. During the corrupt tenure of Switzerland’s Sepp Blatter as president from 1998 to 2015, the political bargaining and wrangling among world football’s officials gained greater media and public attention. Direct conflicts of interest among football’s various groups have also arisen: players, agents, television networks, competition sponsors, clubs, national bodies, continental associations, and FIFA all have divergent views regarding the staging of football tournaments and the distribution of football’s income. Regulation of player representatives and transfers is also problematic. In UEFA countries, players move freely when not under contract. On other continents, notably Africa and Central and South America, players tend to be tied into long-term contracts with clubs that can control their entire careers. FIFA now requires all agents to be licensed and to pass written examinations held by national associations, but there is little global consistency regarding the control of agent powers. In Europe, agents have played a key role in promoting wage inflation and higher player mobility. In Latin America, players are often partially “owned” by agents who may decide on whether transfers proceed. In parts of Africa, some European agents have been compared to slave traders in the way that they exercise authoritarian control over players and profit hugely from transfer fees to Western leagues with little thought for their clients’ well-being. In this way, the ever-widening inequalities between developed and developing nations are reflected in the uneven growth and variable regulations of world football.\n" +
                            "Regional traditions\n" +
                            "Europe\n" +
                            "England and Scotland had the first leagues, but clubs sprang up in most European nations in the 1890s and 1900s, enabling these nations to found their own leagues. Many Scottish professional players migrated south to join English clubs, introducing English players and audiences to more-advanced ball-playing skills and to the benefits of teamwork and passing. Up to World War II, the British continued to influence football’s development through regular club tours overseas and the Continental coaching careers of former players. Itinerant Scots were particularly prominent in central Europe. The interwar Danubian school of football emerged from the coaching legacies and expertise of John Madden in Prague and Jimmy Hogan in Austria.\n" +
                            "Before World War II, Italian, Austrian, Swiss, and Hungarian teams emerged as particularly strong challengers to the British. During the 1930s, Italian clubs and the Italian national team recruited high-calibre players from South America (mainly Argentina and Uruguay), often claiming that these rimpatriati were essentially Italian in nationality; the great Argentinians Raimondo Orsi and Enrique Guaita were particularly useful acquisitions. But only after World War II was the preeminence of the home nations (notably England) unquestionably usurped by overseas teams. In 1950 England lost to the United States at the World Cup finals in Brazil. Most devastating were later, crushing losses to Hungary: 6–3 in 1953 at London’s Wembley Stadium, then 7–1 in Budapest a year later. The “Magical Magyars” opened English eyes to the dynamic attacking and tactically advanced football played on the Continent and to the technical superiority of players such as Ferenc Puskás, József Bozsik, and Nándor Hidegkuti. During the 1950s and ’60s, Italian and Spanish clubs were the most active in the recruitment of top foreign players. For example, the Welshman John Charles, known as “the Gentle Giant,” remains a hero for supporters of the Juventus club of Turin, Italy, while the later success of Real Madrid was built largely on the play of Argentinian Alfredo Di Stefano and the Hungarian Puskás.\n" +
                            "European football has also reflected the wider political, economic, and cultural changes of modern times. Heightened nationalism and xenophobia have pervaded matches, often as a harbinger of future hostilities. During the 1930s, international matches in Europe were often seen as national tests of physical and military capability. In contrast, football’s early post-World War II boom witnessed massive, well-behaved crowds that coincided with Europe’s shift from warfare to rebuilding projects and greater internationalism. More recently, racism became a more prominent feature of football, particularly during the 1970s and early 1980s: many coaches projected negative stereotypes onto black players; supporters routinely abused nonwhites on and off the fields of play; and football authorities failed to counteract racist incidents at games. In general terms, racism at football reflected wider social problems across western Europe. In postcommunist eastern Europe, economic decline and rising nationalist sentiments have marked football culture too. The tensions that exploded in Yugoslavia’s civil war were foreshadowed during a match in May 1990 between the Serbian side Red Star Belgrade and the Croatian team Dynamo Zagreb when violence involving rival supporters and Serbian riot police spread to the pitch to include players and coaches.\n" +
                            "Club football reflects the distinctive political and cultural complexities of European regions. In Britain, partisan football has been traditionally associated with the industrial working class, notably in cities such as Glasgow, Liverpool, Manchester, and Newcastle. In Spain, clubs such as FC Barcelona and Athletic Bilbao are symbols of strong nationalist identity for Catalans and Basques, respectively. In France, many clubs have facilities that are open to the local community and reflect the nation’s corporatist politics in being jointly owned and administered by private investors and local governments. In Italy, clubs such as Fiorentina, Inter Milan, SSC Napoli, and AS Roma embody deep senses of civic and regional pride that predate Italian unification in the 19th century.\n" +
                            "The dominant forces in European national football have been Germany, Italy, and, latterly, France; their national teams have won a total of seven World Cups and six European Championships. Success in club football has been built largely on recruitment of the world’s leading players, notably by Italian and Spanish sides. The European Cup competition for national league champions, first played in 1955, was initially dominated by Real Madrid; other regular winners have been AC Milan, Bayern Munich (Germany), Ajax of Amsterdam, and Liverpool FC(England). The UEFA Cup, first contested as the Fairs Cup in 1955–58, has had a wider pool of entrants and winners.\n" +
                            "\n" +
                            "Since the late 1980s, topflight European football has generated increasing financial revenues from higher ticket prices, merchandise sales, sponsorship, advertising, and, in particular, television contracts. The top professionals and largest clubs have been the principal beneficiaries. UEFA has reinvented the European Cup as the Champions League, allowing the wealthiest clubs freer entry and more matches. In the early 1990s, Belgian player Jean-Marc Bosman sued the Belgian Football Association, challenging European football’s traditional rule that all transfers of players (including those without contracts) necessitate an agreement between the clubs in question, usually involving a transfer fee. Bosman had been prevented from joining a new club (US Dunkerque) by his old club (RC Liège). In 1995 the European courts upheld Bosman’s complaint, and at a stroke freed uncontracted European players to move between clubs without transfer fees. The bargaining power of players was strengthened greatly, enabling top stars to multiply their earnings with large salaries and signing bonuses. Warnings of the end of European football’s financial boom came when FIFA’s marketing agent, ISL, went bust in 2001; such major media investors in football as the Kirch Gruppe in Germany and ITV Digital in the United Kingdom collapsed a year later. Inevitably, the financial boom had exacerbated inequalities within the game, widening the gap between the top players, the largest clubs, and the wealthiest spectators and their counterparts in lower leagues and the developing world.\n" +
                            "North and Central America and the Caribbean\n" +
                            "Football was brought to North America in the 1860s, and by the mid-1880s informal matches had been contested by Canadian and American teams. It soon faced competition from other sports, including variant forms of football. In Canada, Scottish émigrés were particularly prominent in the game’s early development; however, Canadians subsequently turned to ice hockey as their national sport.\n" +
                            "In the United States, gridiron football emerged early in the 20th century as the most popular sport. But, beyond elite universities and schools, soccer (as the sport is popularly called in the United States) was played widely in some cities with large immigrant populations such as Philadelphia, Chicago, Cleveland(Ohio), and St. Louis (Missouri), as well as New York City and Los Angeles after Hispanic migrations. The U.S. Soccer Federation formed in 1913, affiliated with FIFA, and sponsored competitions. Between the world wars, the United States attracted scores of European emigrants who played football for local teams sometimes sponsored by companies.\n" +
                            "Football in Central America struggled to gain a significant foothold in competition against baseball. In Costa Rica, the football federation founded the national league championship in 1921, but subsequent development in the region was slower, with belated FIFA membership for countries such as El Salvador (1938), Nicaragua (1950), and Honduras (1951). In the Caribbean, football traditionally paled in popularity to cricket in former British colonies. In Jamaica, football was highly popular in urban townships, but it did not capture the imagination of the country until 1998, when the national team—featuring several players who had gained success in Britain and were dubbed the “Reggae Boyz”—qualified for the World Cup finals.\n" +
                            "North American leagues and tournaments saw an infusion of professional players in 1967, beginning with the wholesale importation of foreign teams to represent American cities. The North American Soccer League (NASL) formed a year later and struggled until the New York Cosmos signed the Brazilian superstar Pelé in 1975. Other aging international stars soon followed, and crowds grew to European proportions, but a regular fan base remained elusive, and NASL folded in 1985. An indoor football tournament, founded in 1978, evolved into a league and flourished for a while but collapsed in 1992.\n" +
                            "In North America football did establish itself as the relatively less-violent alternative to gridiron football and as a more socially inclusive sport for women. It is particularly popular among college and high school students across the United States. After hosting an entertaining World Cup finals in 1994, the United States possessed some 16 million football players nationwide, up to 40 percent of whom were female. In 1996 a new attempt at establishing a professional outdoor league was made. Major League Soccer (MLS) was more modest in ambition than NASL, being originally played in only 10 U.S. cities, with greater emphasis on local players and a relatively tight salary cap. The MLS proved to be the most successful American soccer league, expanding to 20 teams (with two in Canada) by 2016 while also signing a number of lucrative broadcasting deals with American television networks and some star players from European leagues. The United States hosted and won the Women’s World Cup finals in 1999, attracting enthusiastic local support. The success of the MLS and the Women’s World Cup led to the creation of a women’s professional league in 2001. The Women’s United Soccer Association (WUSA) began with eight teams and featured the world’s star player, Mia Hamm, but it disbanded in 2003.\n" +
                            "\n" +
                            "North American national associations are members of the continental body, CONCACAF, and Mexico is the traditional regional powerhouse. Mexico has won the CONCACAF Gold Cup four times since it was first contested in 1991, and Mexican clubs have dominated the CONCACAF Champions Cup for clubs since it began in 1962. British influence in mining and railroads encouraged the founding of football clubs in Mexico in the late 19th century. A national league was established in 1903. Mexico is exceptional in that its mass preference for football runs counter to the sporting tastes of its North American neighbours. The national league system is the most commercially successful in the region and attracts players from all over the Western Hemisphere. Despite high summer humidity and stadiums at high elevations, Mexico has hosted two of the most memorable World Cup finals, in 1970 and 1986, from which Brazil and Argentina(led by the game’s then greatest players, Pelé and Maradona, respectively) emerged as the respective winners. While the national team has been ranked highly by FIFA, often figuring in the top ten, Mexico has not produced the world-class calibre of players expected of such a large football-crazed nation. Hugo Sanchez (at Real Madrid) has been the only Mexican player to reach the highest world level in modern times.\n" +
                            "Football first came to South America in the 19th century through the port of Buenos Aires, Argentina, where European sailors played the game. Members of the British community there formed the first club, the Buenos Aires Football Club (FC), in 1867; about the same time, British railway workers started another club, in the town of Rosario, Argentina. The first Argentinian league championship was played in 1893, but most of the players belonged to the British community, a pattern that continued until the early 20th century.\n" +
                            "Brazil is believed to be the second South American country where the game was established. Charles Miller, a leading player in England, came to Brazil in 1894 and introduced football in São Paulo; that city’s athletic club was the first to take up the sport. In Colombia, British engineers and workers building a railroad near Barranquilla first played football in 1903, and the Barranquilla FBC was founded in 1909. In Uruguay, British railway workers were the first to play, and in 1891 they founded the Central Uruguay Railway Cricket Club (now the famous Peñarol), which played both cricket and football. In Chile, British sailors initiated play in Valparaíso, establishing the Valparaíso FC in 1889. In Paraguay, Dutchman William Paats introduced the game at a school where he taught physical education, but the country’s first (and still leading) club, Olimpia, was formed by a local man who became enthusiastic after seeing the game in Buenos Aires in 1902. In Bolivia the first footballers were a Chilean and students who had studied in Europe, and in Peru they were expatriate Britons. In Venezuela, British miners are known to have played football in the 1880s.\n" +
                            "\n" +
                            "Soon local people across South America began taking up and following the sport in ever greater numbers. Boys, mostly from poorer backgrounds, played from an early age, with passion, on vacant land and streets. Clubs and players gained popularity, and professionalism entered the sport in most countries around the 1930s—although many players had been paid secretly before then by their clubs. The exodus of South American players to European clubs that paid higher salaries began after the 1930 World Cup and has steadily increased.\n" +
                            "By the late 1930s, football had become a crucial aspect of popular culture in many South American nations; ethnic and national identities were constructed and played out on an increasingly international stage. In South American nations, nonwhite players fought a successful struggle to play at the top level: in Rio de Janeiro, Vasco da Gama was the first club to recruit black players and promptly stormed to the league championship in 1923, encouraging other clubs to follow suit. In Uruguay, a nation of largely mixed European descent, local players learned both the physical style played by the English and the more refined passing game of the Scots, producing a versatility that helped their national team win two Olympic championships and the World Cup between 1924 and 1930.\n" +
                            "In 1916, South American countries were the first to hold a regular continental championship—later known as the Copa América. In 1960 the South American club championship (Libertadores Cup) was started; it has been played annually by the continent’s leading clubs (with the winner playing the European club champion), and, as a result of its popularity, various other international competitions have also been held between clubs. Domestic league championships are split into two or more tournaments each season with frequent variations in format.\n" +
                            "Africa\n" +
                            "European sailors, soldiers, traders, engineers, and missionaries brought football with them to Africa in the second half of the 19th century. The first documented match took place in Cape Town in 1862, after which the game spread rapidly throughout the continent, particularly in the British colonies and in societies with vibrant indigenous athletic traditions.\n" +
                            "During the interwar period, African men in cities and towns, railroad workers, and students organized clubs, associations, and regional competitions. Teams from Algeria, Morocco, and Tunisia competed in the North African championship, established in 1919, and vied for the North African Cup, introduced in 1930. South of the Sahara, Kenya and Uganda first played for the Gossage Trophy in 1924, and the Darugar Cup was established on the island of Zanzibar. In the mining centre of Élisabethville (now Lubumbashi, Congo) a football league for Africans was begun in 1925. In South Africa the game was very popular by the early 1930s, though it was organized in racially segregated national associations for whites, Africans, Coloureds (persons of mixed race), and Indians. In the colonies of British West Africa, the Gold Coast (now Ghana) launched its first football association in 1922, with Nigeria’s southern capital of Lagos following suit in 1931. Enterprising clubs and leagues developed across French West Africa in the 1930s, especially in Senegal and Côte d’Ivoire. Moroccan forward Larbi Ben Barek became the first African professional in Europe, playing for Olympique de Marseille and the French national team in 1938.\n" +
                            "After World War II football in Africa experienced dramatic expansion. Modernizing colonial regimes provided new facilities and created attractive competitions, such as the French West Africa Cup in 1947. The migration of talented Africans to European clubs intensified. Together with his older compatriot Mario Coluña, Mozambican sensation Eusébio, European player of the year in 1965, starred for European champions Benfica of Lisbon and led Portugal to third place in the 1966 World Cup, where he was the tournament’s leading scorer. Algerian stars Rachid Mekhloufi of Saint-Étienne and Mustafa Zitouni of AS Monaco represented France before joining the team of the Algerian National Liberation Front (FLN) in 1958. The FLN eleven, who lost only 4 of 58 matches during the period 1958–62, embodied the close relations between nationalist movements and football in Africa on the eve of decolonization.\n" +
                            "With colonialism’s hold on Africa slipping away, the Confédération Africaine de Football (CAF) was established in February 1957 in Khartoum, Sudan, with the first African Cup of Nations tournament also played at that time. Independent African states encouraged football as a means of forging a national identity and generating international recognition.\n" +
                            "In the 1960s and early ’70s, African football earned a reputation for a spectacular, attacking style of play. African and European coaches emphasized craft, creativity, and fitness within solid but flexible tactical schemes. Salif Keita (Mali), Laurent Pokou (Côte d’Ivoire), and François M’Pelé (Congo [Brazzaville]) personified the dynamic qualities of football in postcolonial Africa.\n" +
                            "In the late 1970s, the migration of talented players overseas began hampering domestic leagues. The effects of this player exodus were somewhat tempered by the rise of “scientific football” and defensive, risk-averting tactics, an international trend that saw African players fall out of favour with European clubs. Even so, the integration of Africa and Africans into world football accelerated in the 1980s and ’90s. Cameroon’s national team, known as the Indomitable Lions, was a driving force in this process. After being eliminated without losing a match at the 1982 World Cup in Spain (tied with Italy in its group, Cameroon lost the tiebreaker on the basis of total goals scored), Cameroon reached the quarterfinals at the 1990 World Cup in Italy, thereby catapulting African football into the global spotlight. Nigeria then captured the Olympic gold medal in men’s football at the Summer Games in Atlanta, Georgia, U.S., in 1996; in 2000 Cameroon won its first Olympic gold medal in men’s football at the Games in Sydney, Australia. Success also came at youth level as Nigeria (1985) and Ghana (1991 and 1995) claimed under-17 world titles. Moreover, Liberian striker George Weah of Paris St. Germain received the prestigious FIFA World Player of the Year award in 1995.\n" +
                            "In recognition of African football’s success and influence, FIFA awarded Africa five places in the 32-team 1998 World Cup finals. This achievement bears witness to African football’s phenomenal passion, growth, and development. This rich and complex history is made more remarkable by the continent’s struggles to cope with a fragile environment, scarce material resources, political conflicts, and the unpleasant legacy of imperialism.\n" +
                            "Asia and Oceania\n" +
                            "Football quickly entered Asia and Oceania in the latter half of the 19th century, but, unlike in Europe, it failed to become a unifying national sport. In Australia it could not dislodge the winter games of Australian rules football (codified before soccer) and rugby. British immigrants to Australia did relatively little to develop football locally. Because southern European immigrants were more committed to founding clubs and tournaments, football became defined as an “ethnic game.” As a result, teams from Melbourne and Sydney with distinctive Mediterranean connections were the most prominent members of the National Soccer League (NSL) when it started in 1977. The league has widened its scope, however, to include a highly successful Perth side, plus a Brisbane club and even one from Auckland, N.Z. The NSL collapsed in 2004, but a new league, known as the A-League, emerged the next year.\n" +
                            "In New Zealand, Scottish players established clubs and tournaments from the 1880s, but rugby became the national passion. In Asia, during the same germinal period, British traders, engineers, and teachers set up football clubs in such colonial outposts as Shanghai, Hong Kong, Singapore, and Burma (Myanmar). Yet football’s major problem across Asia, until the 1980s, was its failure to establish substantial roots among indigenous peoples beyond college students returning from Europe. Football in India was particularly prominent in Calcutta (Kolkata) among British soldiers, but locals soon adopted cricket. In Japan, Yokohama and Kobe housed large numbers of football-playing foreigners, but local people retained preferences for the traditional sport of sumo wrestling and the imported game of baseball.\n" +
                            "At the turn of the 21st century, football became increasingly important in Asian societies. In Iran, national team football matches became opportunities for many to express their reformist political views as well as for broad public celebration. The Iraqi men’s team’s fourth-place finish at the 2004 Olympic Games in Athensstruck a chord of hope for their war-torn homeland.\n" +
                            "The Asian game is organized by the Asian Football Confederation, comprising 46 members in 2011 and stretching geographically from Lebanon in the Middle Eastto Guam in the western Pacific Ocean. The Asian Cup for national teams has been held quadrennially since 1956; Iran, Saudi Arabia, and Japan have dominated, with South Korea a regular runner-up. These countries have also produced the most frequent winners of the annual Asian Club Championship, first contested in 1967.\n" +
                            "Asian economic growth during the 1980s and early 1990s and greater cultural ties to the West helped cultivate club football. Japan’s J-League was launched in 1993, attracting strong public interest and a sprinkling of famous foreign players and coaches (notably from South America). Attendance and revenue declined from 1995, but the league survived and was reorganized into two divisions of 16 and 10 clubs, respectively, by 1999. The league grew to 30 teams by 2005.\n" +
                            "Some memorable international moments have indicated the potential of football in Asia and Oceania. Asia’s first notable success was North Korea’s stunning defeat of Italy at the 1966 World Cup finals. In 1994 Saudi Arabia became the first Asian team to qualify for the World Cup’s second round. The entertaining 2002 World Cup hosted by Japan and South Korea and the on-field success of the host nations’ national teams (South Korea reached the semifinals; Japan reached the second round) stood as the region’s brightest accomplishment in international football.\n" +
                            "Football’s future in Asia and Oceania depends largely upon regular competition with top international teams and players. Increased representation in the World Cup finals (since 1998 Asia has sent four teams, and since 2006 Oceania has had a single automatic berth) has helped development of the sport in the region. Meanwhile, domestic club competitions across Asia and Oceania have been weakened by the need for top national players to join better clubs in Europe or South America to test and improve their talents at a markedly higher level. One promising development for the continent came in 2010 when Qatar was announced as the host of the 2022 World Cup, which will be the first World Cup held in the Middle East.\n" +
                            "Spectator problems\n" +
                            "The spread of football throughout the globe has brought together people from diverse cultures in celebration of a shared passion for the game, but it has also spawned a worldwide epidemic of spectator hooliganism. High emotions that sometimes escalate into violence, both on and off the field, have always been a part of the game, but concern with fan violence and hooliganism has intensified since the 1960s. The early focus of this concern was British fans, but the development of the anti-hooligan architecture of football grounds around the world points to the international scope of the problem. Stadiums in Latin America are constructed with moats and high fences. Many grounds in Europe now ban alcohol and no longer offer sections where fans can stand; those “terraces,” which charged lower admission than ticketed seating, were the traditional flash points of fan violence.\n" +
                            "Some of the first modern hooligan groups were found in Scotland, where religious sectarianism arose among the supporters of two Glasgow teams: Rangers, whose fans were predominantly Protestant unionists, and Celtic, whose fans were drawn largely from the city’s sizeable Irish Catholic community. Between the World Wars, “razor gangs” fought street battles when these two clubs met. Since the late 1960s, however, English fan hooliganism has been even more notorious, especially when English supporters have followed their teams overseas. The nadir of fan violence came during the mid-1980s. At the European Cup final in 1985 between Liverpool and the Italian club Juventus at Heysel Stadium in Brussels, 39 fans (38 Italian, 1 Belgian) died and more than 400 were injured when, as Liverpool supporters charged opposing fans, a stadium wall collapsed under the pressure of those fleeing. In response, English clubs were banned from European competition until 1990, but by then hooliganism had become established in many other European countries. By the turn of the 21st century, self-identifying hooligans could be found among German, Dutch, Belgian, and Scottish supporters. Elsewhere, militant fans included the ultras in Italy and southern France, and the various hinchadas of Spain and Latin America, whose levels of violence varied from club to club. Argentina has experienced perhaps the worst consequences, with an estimated 148 deaths between 1939 and 2003 from violent incidents that often involved security forces.\n" +
                            "The causes of football hooliganism are numerous and vary according to the political and cultural context. High levels of alcohol consumption can exaggerate supporter feelings and influence aggression, but this is neither the single nor the most important cause of hooliganism, given that many heavily intoxicated fans instead behave gregariously. In northern Europe fan violence has acquired an increasingly subcultural dimension. At major tournaments, self-identifying hooligans sometimes can spend weeks pursuing their distinctive peers among opposing supporters to engage in violence; the most successful combatants earn status within the subcultural network of hooligan groups. Research in Britain suggests these groups do not hail from society’s poorest members but usually from more-affluent working-class and lower middle-class backgrounds, depending upon regional characteristics. In southern Europe, notably in Italy, spectator violence can also reflect deep-seated cultural rivalries and tensions, especially between neighbouring cities or across the divide between north and south. In Latin America fan violence has been understood in relation to the modern politics of dictatorship and repressive state methods of social control. Moreover, the upsurge in violence in Argentina beginning in the late 1990s has been explained according to the severe decline of the national economy and the political system.\n" +
                            "In some circumstances, football hooliganism has forced politicians and the judiciary to intercede directly. In England the Conservative government of the 1980s targeted football hooligans with legislation, and the subsequent Labour administration unveiled further measures to control spectator behaviour inside stadiums. In Argentina, football matches were briefly suspended by the courts in 1999 in a bid to halt the violence. Football authorities have also recognized fan violence as a major impediment to the game’s economic and social health. In England attempts at reducing hooliganism have included all-seated stadiums and the creation of family-only stands. These measures have helped attract new, wealthier spectators, but critics have argued that the new policies have also diminished the colour and atmosphere at football grounds. More liberal anti-hooligan strategies encourage dialogue with supporters: the “fan projects” run by clubs and local authorities in Germany, the Netherlands, and Sweden are the strongest illustrations of this approach.\n" +
                            "Still, the major threats to spectator safety tend to involve not fighting among supporters but rather a mixture of factors such as disorderly crowd responses to play in the match, unsafe facilities, and poor crowd-control techniques. In the developing world, crowd stampedes have caused many disasters, such as the 126 deaths in Ghana in 2001. Police attempts to quell disorderly crowds can backfire and exacerbate the dangers, as was the case in Peru in 1964 when 318 died and in Zimbabwe in 2000 when 13 died. Disastrous crowd management strategies and facilities that some have characterized as inhumane were at the root of the tragedy in Hillsborough Stadium in Sheffield, England, in 1989, in which 96 were fatally injured when they were crushed inside the football ground.\n" +
                            "It would be quite wrong, however, to portray the vast majority of football fans as inherently violent or xenophobic. Since the 1980s, organized supporter groups, along with football authorities and players, have waged both local and international campaigns against racism and (to a lesser extent) sexism within the game. Football supporters with the most positive, gregarious reputations—such as those following the Danish, Irish, and Brazilian national sides—tend to engage in self-policing within their own ranks, with few calls for outside assistance. As part of their Fair Play campaigns, international football bodies have introduced awards for the best-behaved supporters at major tournaments. In more challenging circumstances, English fan organizations such as the Football Supporters’ Federation have sought to improve the behaviour of their compatriots at matches overseas by planning meetings with local police officials and introducing “fan embassies” for visiting supporters. Across Europe, international fan networks have grown up to combat the racism that has also been reflected in some hooliganism. More generally, since the mid-1980s, the production of fanzines (fan magazines) across Britain and some other parts of Europe have served to promote the view that football fans are passionate, critical, humorous, and (for the great majority) not at all violent. Such fanzines have been supplemented by—and in many ways surpassed by—Internet fan sites in the 21st century.\n"
                            ;
                }
                else if(myListView.getItemAtPosition(position).toString().trim().equals("HowToFootball")){
                    //setting value of the paragraph string
                    paragraph = "Play Of The Game\n" +
                            "The rules of football regarding equipment, field of play, conduct of participants, and settling of results are built around 17 laws. The International Football Association Board, consisting of delegates from FIFA and the four football associations from the United Kingdom, is empowered to amend the laws.\n" +
                            "Equipment and field of play\n" +
                            "The object of football is to maneuver the ball into the opposing team’s goal, using any part of the body except the hands and arms. The side scoring more goals wins. The ball is round, covered with leather or some other suitable material, and inflated; it must be 27–27.5 inches (68–70 cm) in circumference and 14.5–16 ounces (410–450 grams) in weight. A game lasts 90 minutes and is divided into halves; the halftime interval lasts 15 minutes, during which the teams change ends. Additional time may be added by the referee to compensate for stoppages in play (for example, player injuries). If neither side wins, and if a victor must be established, “extra-time” is played, and then, if required, a series of penalty kicks may be taken.\n" +
                            "The penalty area, a rectangular area in front of the goal, is 44 yards (40.2 metres) wide and extends 18 yards (16.5 metres) into the field. The goal is a frame, backed by a net, measuring 8 yards (7.3 metres) wide and 8 feet (2.4 metres) high. The playing field (pitch) should be 100–130 yards (90–120 metres) long and 50–100 yards (45–90 metres) wide; for international matches, it must be 110–120 yards long and 70–80 yards wide. Women, children, and mature players may play a shorter game on a smaller field. The game is controlled by a referee, who is also the timekeeper, and two assistants who patrol the touchlines, or sidelines, signaling when the ball goes out of play and when players are offside.\n" +
                            "Players wear jerseys with numbers, shorts, and socks that designate the team for whom they are playing. Shoes and shin guards must be worn. The two teams must wear identifiably different uniforms, and goalkeepers must be distinguishable from all players and match officials.\n" +
                            "Fouls\n" +
                            "Free kicks are awarded for fouls or violations of rules; when a free kick is taken, all players of the offending side must be 10 yards (9 metres) from the ball. Free kicks may be either direct (from which a goal may be scored), for more serious fouls, or indirect (from which a goal cannot be scored), for lesser violations. Penalty kicks, introduced in 1891, are awarded for more serious fouls committed inside the area. The penalty kick is a direct free kick awarded to the attacking side and is taken from a spot 12 yards (11 metres) from goal, with all players other than the defending goalkeeper and the kicker outside the penalty area. Since 1970, players guilty of a serious foul are given a yellow caution card; a second caution earns a red card and ejection from the game. Players may also be sent off directly for particularly serious fouls, such as violent conduct.\n" +
                            "Rules\n" +
                            "There were few major alterations to football’s laws through the 20th century. Indeed, until the changes of the 1990s, the most significant amendment to the rules came in 1925, when the offside rule was rewritten. Previously, an attacking player (i.e., one in the opponent’s half of the playing field) was offside if, when the ball was “played” to him, fewer than three opposing players were between him and the goal. The rule change, which reduced the required number of intervening players to two, was effective in promoting more goals. In response, new defensive tactics and team formations emerged. Player substitutions were introduced in 1965; teams have been allowed to field three substitutes since 1995.\n" +
                            "More recent rule changes have helped increase the tempo, attacking incidents, and amount of effective play in games. The pass-back rule now prohibits goalkeepers from handling the ball after it is kicked to them by a teammate. “Professional fouls,” which are deliberately committed to prevent opponents from scoring, are punished by red cards, as is tackling (taking the ball away from a player by kicking or stopping it with one’s feet) from behind. Players are cautioned for “diving” (feigning being fouled) to win free kicks or penalties. Time wasting has been addressed by forcing goalkeepers to clear the ball from hand within six seconds and by having injured players removed by stretcher from the pitch. Finally, the offside rule was adjusted to allow attackers who are level with the penultimate defender to be onside.\n" +
                            "Interpretation of football’s rules is influenced heavily by cultural and tournamentcontexts. Lifting one’s feet over waist level to play the ball is less likely to be penalized as dangerous play in Britain than in southern Europe. The British game can be similarly lenient in punishing the tackle from behind, in contrast to the trend in recent World Cup matches. FIFA insists that “the referee’s decision is final,” and it is reluctant to break the flow of games to allow for video assessmenton marginal decisions. However, the most significant future amendments or reinterpretations of football’s rules may deploy more efficient technology to assist match officials. Post-match video evidence is used now by football’s disciplinary committees, particularly to adjudicate violent play or to evaluate performances by match officials.\n" +
                            "Strategy and tactics\n" +
                            "Use of the feet and (to a lesser extent) the legs to control and pass the ball is football’s most basic skill. Heading the ball is particularly prominent when receiving long aerial passes. Since the game’s origins, players have displayed their individual skills by going on “solo runs” or dribbling the ball past outwitted opponents. But football is essentially a team game based on passing between team members. The basic playing styles and skills of individual players reflect their respective playing positions. Goalkeepers require agility and height to reach and block the ball when opponents shoot at goal. Central defenders have to challenge the direct attacking play of opponents; called upon to win tackles and to head the ball away from danger such as when defending corner kicks, they are usually big and strong. Fullbacks are typically smaller but quicker, qualities required to match speedy wing-forwards. Midfield players (also called halfs or halfbacks) operate across the middle of the field and may have a range of qualities: powerful “ball-winners” need to be “good in the tackle” in terms of winning or protecting the ball and energetic runners; creative “playmakers” develop scoring chances through their talent at holding the ball and through accurate passing. Wingers tend to have good speed, some dribbling skills, and the ability to make crossing passes that travel across the front of goal and provide scoring opportunities for forwards. Forwards can be powerful in the air or small and penetrative with quick footwork; essentially, they should be adept at scoring goals from any angle.\n" +
                            "Tactics reflect the importance of planning for matches. Tactics create a playing system that links a team’s formation to a particular style of play (such as attacking or counterattacking, slow or quick tempo, short or long passing, teamwork or individualistic play). Team formations do not count the goalkeeper and enumerate the deployment of players by position, listing defenders first, then midfielders, and finally attackers (for example, 4-4-2 or 2-3-5). The earliest teams played in attack-oriented formations (such as 1-1-8 or 1-2-7) with strong emphasis on individual dribbling skills. In the late 19th century, the Scots introduced the passing game, and Preston North End created the more cautious 2-3-5 system. Although the English were associated with a cruder kick-and-rush style, teamwork and deliberate passing were evidently the more farsighted aspects of an effective playing system as playing skills and tactical acumenincreased.\n" +
                            "Between the wars, Herbert Chapman, the astute manager of London’s Arsenalclub, created the WM formation, featuring five defenders and five attackers: three backs and two halves in defensive roles, and two inside forwards assisting the three attacking forwards. Chapman’s system withdrew the midfield centre-half into defense in response to the 1925 offside rule change and often involved effective counterattacking, which exploited the creative genius of withdrawn forward Alex James as well as Cliff Bastin’s goal-scoring prowess. Some teams outside Britain also withdrew their centre-half, but others (such as Italy at the 1934 World Cup, and many South American sides) retained the original 2-3-5 formation. By the outbreak of World War II, many clubs, countries, and regions had developed distinctive playing styles—such as the powerful combative play of the English, the technical short-passing skills of the Danubian School, and the criollo artistry and dribbling of Argentinians.\n" +
                            "After the war, numerous tactical variations arose. Hungary introduced the deep-lying centre-forward to confuse opposing defenders, who could not decide whether to mark the player in midfield or let him roam freely behind the forwards. The complex Swiss verrou system, perfected by Karl Rappan, saw players switch positions and duties depending on the game’s pattern. It was the first system to play four players in defense and to use one of them as a “security bolt” behind the other three. Counterattacking football was adopted by top Italian clubs, notably Internazionale of Milan. Subsequently, the catenacciosystem developed by Helenio Herrera at Internazionale copied the verrou system, playing a libero (free man) in defense. The system was highly effective but made for highly tactical football centred on defense that was often tedious to watch.\n" +
                            "Several factors contributed to the generation of more defensive, negative playing styles and team formations. With improved fitness training, players showed more speed and stamina, reducing the time and space for opponents to operate. The rules of football competitions (such as European club tournaments) often have encouraged visiting teams to play for draws, while teams playing at home are very wary of conceding goals. Local and national pressures not to lose matches have been intense, and many coaches discourage players from taking risks.\n" +
                            "As football’s playing systems became more rationalized, players were no longer expected to stay in set positions but to be more adaptable. The major victim was the wing-forward, the creator of attacking openings, whose defensive limitations were often exposed. Internationally, Brazil became the greatest symbol of individualistic, flowing football. Brazil borrowed the 4-2-4 formation founded in Uruguay to win the 1958 World Cup; the tournament was widely televised, thus helping Brazil’s highly skilled players capture the world’s imagination. For the 1962 tournament in Chile, Brazil triumphed again, withdrawing one winger into midfield to create 4-3-3. England’s “Wingless Wonders” won the 1966 tournament with a more cautious variant of 4-3-3 that was really 4-4-2, employing no real wingers and a set of players more suited to work than creative passing or dribbling skills.\n" +
                            "In the early 1970s, the Dutch “total football” system employed players with all-around skills to perform both defensive and attacking duties, but with more aesthetically pleasing consequences. Players such as Johan Cruyff and Johan Neeskens provided the perfect outlets for this highly fluent and intelligent playing system. Holland’s leading club—Ajax of Amsterdam—helped direct total football into a 3-4-3 system; Ajax’s long-term success was also built upon one of the world’s leading scouting and coaching systems, creating a veritable conveyor belt of educated, versatile players. However, hustling playing styles built around the now classic 4-4-2 formation have been especially prominent in Europe, notably as a result of the successes of English clubs in European competition from the mid-1970s to mid-1980s. The great Milan team of the late 1980s recruited the talented Dutch triumvirate of Ruud Gullit, Frank Rijkaard, and Marco van Basten, but their national and European success was founded too upon a “pressing” system in which opponents were challenged relentlessly for every loose ball.\n" +
                            "The move towards efficient playing systems such as 4-4-2 saw changes in defensive tactics. Zonal defending, based on controlling specific spaces, became more prominent. Conversely, the classic catenaccio system had enabled greater man-to-man marking of forwards by defenders, with the libero providing backup when required. Subsequently, some European clubs introduced 3-5-2 formations using wingbacks (a hybrid of fullback and attacking winger) on either side of the midfield. Players such as Roberto Carlos of Real Madrid and Brazil are outstanding exponents of this new role, but for most wingbacks their attacking potential is often lost in midfield congestion and compromised by their lack of dribbling skills.\n" +
                            "After 1990, as media coverage of football increased in Europe and South Americaand as the game enjoyed a rise in popularity, playing systems underwent closer analysis. They are now often presented in strings of four: 1-3-4-2 features a libero, three defenders, four midfielders and two forwards; 4-4-1-1 calls for four defenders, four midfielders, and a split strike force with one forward playing behind the other. The different roles and playing spaces of midfield players have become more obvious: for example, the four-player midfield diamond shape has one player in an attacking role, two playing across the centre, and one playing a holding role in front of the defenders.\n" +
                            "Differences in playing systems between Latin American and European teams have declined markedly. During the 1960s and ’70s, Brazilian and Argentinian teams went through “modernizing” phases in which the European values of efficiency, physical strength, and professionalism were promoted in place of more traditional local styles that emphasized greater individualism and display of technical skills. South American national teams are now very likely to be composed entirely of players who perform for European clubs and to play familiar 3-5-2 or 4-4-2 systems.\n" +
                            "For all these tactical developments, football’s finest players and greatest icons remain the brilliant individualists: the gifted midfield playmakers, the dazzling wingers, or the second forwards linking the midfield to the principal attacker. Some leading postwar exponents have included Pelé, Rivaldo, and Ronaldo(Brazil), Diego Maradona and Lionel Messi (Argentina), Roberto Baggio and Francesco Totti (Italy), Michel Platini and Zinedine Zidane (France), George Best(Northern Ireland), Stanley Matthews and Paul Gascoigne (England), Ryan Giggs (Wales), Luis Figo, Eusébio, and Cristiano Ronaldo (Portugal), and Jim Baxter and Derek Johnstone (Scotland).\n" +
                            "FIFA Men’s World Cup Winners\n" +
                            "Winners of the FIFA men’s World Cup are provided in the table.\n" +
                            "FIFA World Cup—men\n" +
                            "*Won after extra time (AET).\n" +
                            "**Won on penalty kicks.\n" +
                            "year\tresult\n" +
                            "1930\tUruguay\t4\tArgentina\t2\n" +
                            "1934\tItaly*\t2\tCzechoslovakia\t1\n" +
                            "1938\tItaly\t4\tHungary\t2\n" +
                            "1950\tUruguay\t2\tBrazil\t1\n" +
                            "1954\tWest Germany\t3\tHungary\t2\n" +
                            "1958\tBrazil\t5\tSweden\t2\n" +
                            "1962\tBrazil\t3\tCzechoslovakia\t1\n" +
                            "1966\tEngland*\t4\tWest Germany\t2\n" +
                            "1970\tBrazil\t4\tItaly\t1\n" +
                            "1974\tWest Germany\t2\tNetherlands\t1\n" +
                            "1978\tArgentina*\t3\tNetherlands\t1\n" +
                            "1982\tItaly\t3\tWest Germany\t1\n" +
                            "1986\tArgentina\t3\tWest Germany\t2\n" +
                            "1990\tWest Germany\t1\tArgentina\t0\n" +
                            "1994\tBrazil**\t0\tItaly\t0\n" +
                            "1998\tFrance\t3\tBrazil\t0\n" +
                            "2002\tBrazil\t2\tGermany\t0\n" +
                            "2006\tItaly**\t1\tFrance\t1\n" +
                            "2010\tSpain*\t1\tNetherlands\t0\n" +
                            "2014\tGermany*\t1\tArgentina\t0";
                }
                else if(myListView.getItemAtPosition(position).toString().trim().equals("Petcare")){
                    //setting value of the paragraph string
                    paragraph = "\n" +
                            "Ant-Proof Pet Food Dishes\n" +
                            "In the summertime, a favorite destination for ants is often a pet's food bowl. Here's a simple way to keep them out of your dog or cat's food?set the dish in a pan of water. Not only does it keep the ants out of the pet food, but your pet can take a gulp of water from the pan whenever he or she needs a drink. Keep the rest of your home clear of ants, too.\n" +
                            "\n" +
                            "Rainy-Day Doghouse\n" +
                            "Use a plastic storage bin for a dog house. A nice little doghouse that will hold up in the rain can cost $100 (though dog carpenters can cut down on labor costs). But you can make your own for a fraction of the price using a plastic storage bin. Cut a small hole in the bin, flip it over on its lid and stick a dog bed inside it. Your dog will love watching the rain from inside his snug little house, and you'll save $85! Don't be surprised if your cat likes it so much you'll have to make one for her too.\n" +
                            "\n" +
                            "Chew-Free Electrical Cords\n" +
                            "Some dogs love to gnaw on electrical cords around the house. This is not only dangerous but also really irritating when they destroy your computer cables. Solve the problem by wrapping the cords with split flexible plastic conduit that you get at home centers and automotive stores. Just cut the length you need and push the cords into the pre-split slot. Your dog will soon lose interest in the cords (so you have time to fix them). Now if you could just get him to stop chewing up your slippers!\n" +
                            "\n" +
                            "Private Dining\n" +
                            "Does your dog eat your cat's food? Put a stop to the double-dipping by moving your cat's dish into a different room that has a door. Attach adhesive-backed hook-and-loop fasteners to the back of the door and to the front of the trim. After filling the cat's dish, hook up the fasteners so the door only opens 5 in. Now your cat can come and go and eat his meal in peace. If Fido is itchin' to get in, you may have some other work to do, too.\n" +
                            "\n" +
                            "Portable Water Dish\n" +
                            "Use a shower cap as a portable water bowl. A long walk with your dog on a hot day will make you and your pet pretty thirsty. Before leaving the house, stuff a plastic shower cap in your pocket. That way, you can give your dog a drink from any handy tap, drinking fountain or your water bottle whenever she needs a slurp.\n" +
                            "\n" +
                            "Wind-Proof Dog Dishes\n" +
                            "How many times have you gone outside to fill your dog's food or water dish only to find that it's blown halfway across the yard? The really heavy pet dishes are expensive, but here's a cheap dog dish that won't blow away. Fill a plastic ice cream bucket with a couple of inches of sand, and then put a second container the same size inside it. Use the inside bucket as your dog's dish and it'll stay right where you put it. Next step: Build a chain link kennel for your dog.\n" +
                            "\n" +
                            "Quick Cleanup Cat Litter\n" +
                            "Cut your litter cleanup time in half with this nifty trick. Line your litter pan with a plastic kitchen garbage bag before adding the litter. Get the best household cleaning supplies and products here.\n" +
                            "\n" +
                            "Bell Training for Dogs\n" +
                            "Help your dog 'talk' to you with bells. Here's an easy way your dog can let you know she needs to go outside without any barking or scratching at the door. Hang some bells from the doorknob and your dog will quickly learn to associate the sound of the bells with the door opening. Soon she'll nudge them herself. You can speed things along by jiggling the bells and saying 'Outside? Wanna go outside?' for a few days every time your dog goes out. Your dog will be able to 'talk' to you about going outside even when you're somewhere else in the house. It's definitely better than the alternative.\n" +
                            "\n" +
                            "Easier Bath Time\n" +
                            "For a calmer and easier bath time, make a dog washing station in your shower. Cover the drain with a hair catcher to prevent fur from clogging it. Cut a hole in a bath mat so it fits over the drain and lay it in the shower to prevent your dog from slipping around. Using a handheld sprayer gives you more control and lets you avoid spraying water into your pet's ears. Everyone involved will find bath day a whole lot more pleasant.\n" +
                            "\n" +
                            "Paint Tray Birdbath\n" +
                            "Many pet birds love to take baths. Next bath time, try using a new plastic paint tray as a bathtub! The ribs on the bottom of the tray provide traction, and the tray's slope allow your pets to wade in the shallow water until they're ready to move into the deep end. Paint trays are cheap and easy to clean, and they also make great turtle pools (but don't tell your birds).\n" +
                            "\n" +
                            "No-Barking Zone\n" +
                            "Does your dog's barking in the car drive you nuts? Try this trick: Every time your dog barks, close the windows (watch her head). She'll quickly learn that barking means no fresh air and no slobbery tongue flapping in the breeze. After a few car rides, you'll both be driving around in blissful silence.\n" +
                            "\n" +
                            "Dog-Spot Lawn Solutions\n" +
                            "Growing a neat lawn in an area frequented by dogs is difficult but not impossible. Here are a few tricks for keeping the grass green.\n" +
                            "1.Apply lime or gypsum regularly to neutralize the acid in the soil.\n" +
                            "2.Water the area heavily each week to dilute the urine.\n" +
                            "3.Don't fight it! Replace the grass with small round gravel (pea rock) bordered with stone cobbles or brick. Place landscape fabric beneath the rock to prevent weeds from popping up. And another plus?less grass to mow!\n" +
                            "\n" +
                            "Bunny Rabbit A/C\n" +
                            "Hot summer days are tough on bunnies. Here's a great way to recycle plastic water bottles and keep your bunnies cool at the same time. Fill the bottles with water, freeze them solid and then set them out in the rabbit hutches. The bunnies love to laze against the bottles as the ice thaws. This works great with puppies, too.\n" +
                            "\n" +
                            "Fur Filter for Dog Bathing\n" +
                            "If you wash your dog in the bathtub or shower, you're begging for a clogged drain. Keep fur out of the drain with a mesh-type scrubbing pad. In a shower, clip the pad to the drain plate with a bobby pin. In a bathtub, wedge two pads under the stopper from two sides. The pads catch fur but let water flow through.\n" +
                            "\n" +
                            "Enzymes Eliminate Pet Stains and Odors\n" +
                            "Enzyme products are easy to use on pet stains—just spray or blot them on the stain according to the directions. The products contain harmless bacteria that 'eat' the organic matter that causes the odor. When the organic matter is gone, the bacteria run out of food and die. The whole process will take anywhere from a few hours to a few days. Some manufacturers recommend covering the area with plastic or a wet cloth to keep the bacteria moist and healthy. Get rid of other bad smells in the house.\n" +
                            "\n" +
                            "Ideas for Clean Birdbaths\n" +
                            "Keep the birds happy! To clean your birdbath, put two cups of vinegar in the bath and fill it to the brim with water. Cover with a trash-can lid, and let the bath soak over night. Scrub and rinse well. To attract butterflies to your birdbath and avoid algae, put a layer of builder's sand in the bottom of the birdbath. Add a pantyhose leg stuffed with oat straw inside to your water for an algae-free birdbath.\n" +
                            "\n" +
                            "\n" +
                            "Low-Fat Dog Treats\n" +
                            "Is your dog getting a little chubby? Try replacing his high-calorie treats with plain rice cakes. Even if you think they're tasteless, dogs go nuts over them and vets often suggest them as a lower fat (and less expensive) substitute for regular dog treats.\n" +
                            "The Big-Dog Diner   My dog is pretty big, and I hate seeing him strain his neck every time he eats from his bowl. You can buy a pair of elevated dog bowls for $20 to $40 at pet stores, but I decided to make my own out of a couple of cheap 2-gallon plastic buckets from a discount store. I just flipped them upside down, cut holes in the bottoms with a jigsaw and set a couple of 2-qt. stainless steel bowls into the openings.";
                }
                else if(myListView.getItemAtPosition(position).toString().trim().equals("DanceTips")){
                    //setting value of the paragraph string
                    paragraph = "DANCE TIPS:" +
                            "We all like to look up to the good dancers. I support this; it’s great to have role models.\n" +
                            "But how did they get so good? Stop spending such a massive quantity of your time wondering! It makes Rebecca sad.\n" +
                            "As I’ve mentioned elsewhere, it’s not magic. It’s also not “natural talent.”\n" +
                            "Dancers get good by doing lots of things differently. Read on to find out 22 uncommon actions they take and why you should too.\n" +
                            "NOTE: Most lindy hoppers I’ve asked aren’t 100% satisfied with their dancing. If you’re in that camp, follow the directions at the end to get the most out of this post.\n" +
                            "Good dancers…\n" +
                            "1. Overcome excuses about why they can’t practice. Ain’t no way you’re moving up if you can’t gain some momentum in your dance practice.\n" +
                            "2. Take music seriously. If you need convincing, you’re not ready to advance.\n" +
                            "3. Use both a mirror and video regularly in practice. Oh, I know there’s resistance to this. I dare you to try this every week for a month, then come tell me you failed. You won’t do it. Fail, I mean. It will be a raging success, and you’ll wish you’d gotten over yourself earlier.\n" +
                            "4. Analyze themselves on video. It may pain you at first, but the cringing doesn’t last for long.\n" +
                            "5. Ignore the haters. If everyone likes you, you’re probably boring.\n" +
                            "6. Learn to dance without a partner. Relying on your partner is a crutch. If you can hold your own on the dance floor, nothing can stop you. Plus practicing alone is surprisingly good for you.\n" +
                            "7. Strive to constantly make new discoveries about dancing (rather than waiting to be spoon fed the answers). This is a crucial part of developing your unique perspective and voice. Don’t be a dance robot.\n" +
                            "8. Seek out instructors/mentors they mesh with and who push them.\n" +
                            "9. Practice the shit out of everything. Does this one need explaining? Of course you’ll need to do high-quality practice, not mindless practice.\n" +
                            "10. Disregard their inner critics’ harsh thoughts. Your inner critic is just a little child trying to distract you from doing worthwhile things. Hit the ignore button.\n" +
                            "11. Take aches and pains seriously. Our world is full of promising dancers who ignored their injuries and failed to excel. It’s never too late to start treating your body right.\n" +
                            "12. Develop a unique voice and perspective on dance. You’ll need to figure out what this means to you. I can only promise that this is usually a difficult process. But hey, you’re looking for hard things to work on and making your own discoveries now, right?\n" +
                            "13. Work on hard things. Most dancers focus on what comes easy. This is good for your ego in the short term, but so-so for your dancing. Look for and practice moves and concepts that challenge you. It gives you the most bang for you buck.\n" +
                            "14. Listen to jazz [or insert your genre here] just for fun. Just because there’s a picture of a rubber ducky wearing a storm trooper helmet above doesn’t mean you can skip this.\n" +
                            "15. Test themselves regularly. Practice is not “the thing.” Do The Thing you actually want to do! Perform, enter comps, choreograph, teach, film dance videos—whatever calls to you. Go do lots of that, then do lots more.\n" +
                            "16. Always work on improving fitness. Good muscular balance and aerobic conditioning augment your dance ability. If you’re looking for a place to start, try glute exercises.\n" +
                            "17. Avoid shit talking, complaining, and making excuses. This type of negativity just holds you back. Jealousy and self-sabotage anyone?\n" +
                            "18. Ignore their judgmental thoughts. We all have ’em, and they are terribly distracting. Go get to work!\n" +
                            "19. Truly believe they can do it. It’s the difference between a fixed mindset and a growth mindset. You always have the ability to improve. Ponder that, take it to heart; it IS the truth.\n" +
                            "20. Find friends who support them. Possibly the most confounding item on this list. Adults these days have a hard time finding good friends, don’t we? And then there’s the expectation that we should be able to do it all alone. Bullshit. Every successful person has a ton of support from their friends. This applies to dancers too.\n" +
                            "21. Get consistent, accurate feedback during practice. Your partner, instructor, mirror, and video can all help.\n" +
                            "22. Commit. You’re going to be doing this a long time. Keep going, even when it gets really tough. And it WILL get tough.\n" +
                            "Do This Now!\n" +
                            "Grab a notebook and ask yourself, “Which have I done well at? Which are falling through the cracks?” Evaluate yourself honestly; no one’s watching.\n" +
                            "For each action above you can improve on, jot down a few notes about how you can improve.\n" +
                            "For example, I want to analyze myself on video more often. My notes might say, “Take a 60 second video halfway through practice. Watch it 3 times, pick 2 things to work on, then work on them for the rest of practice.”\n" +
                            "Then go try some of those plans.\n" +
                            "Remember: It’s not magic. As soon as you start taking these actions to improve your dancing, you’ll see results. Go on, I dare you to try!\n" +
                            "For more help getting your practice groove on, download my course Secrets of Better Dance Practice\n";
                }
                else if(myListView.getItemAtPosition(position).toString().trim().equals("BodyBuildingTips")){
                    //setting value of the paragraph string
                    paragraph = "Whether you want to compete professionally or simply sculpt a well-muscled physique, becoming a bodybuilder can be a highly rewarding endeavor -- regardless of your gender. According to professional bodybuilder Rebecca Starling, bodybuilding helps you develop a fit mind along with a fit body. However, bodybuilding involves more than lifting weights at the gym: it also requires patience, discipline and a well-designed dietary regimen. With proper planning and dedication, you can set foot into the challenging but rewarding world of bodybuilding.\n" +
                            "\n" +
                            "Exercise\n" +
                            "Step 1\n" +
                            "Acquire a gym membership or invest in a set of free weights to use at home. Bodybuilding requires rigorous strength training sessions, and you will need access to a variety of dumbbells, barbells or weight machines in order to build your physique.\n" +
                            "\n" +
                            "Step 2\n" +
                            "Schedule strength training sessions three times per week, up to one hour per workout, and allow one to two days of rest between sessions. This allows your muscles adequate recovery time and minimizes the risk of overtraining, which can impede your progress as a bodybuilder.\n" +
                            "Step 3\n" +
                            "Perform exercises for all major muscle groups -- including the hamstrings, calves, gluteus maximus, quadriceps, shoulders, chest, lats, trapezius, abdominals, triceps and biceps. Targeting all areas of your body ensures your physique will develop proportionately and helps you avoid injury.\n" +
                            "\n" +
                            "Step 4\n" +
                            "Choose weight amounts that make it difficult -- but not impossible -- to perform eight to 12 consecutive repetitions of each exercise. Using challenging weight amounts is key for overloading your muscles, which in turn promotes the growth of lean mass.\n" +
                            "\n" +
                            "Diet\n" +
                            "Step 1\n" +
                            "Eat ample quantities of protein-rich foods -- including low-fat dairy, fish, lean cuts of meat, egg whites, nuts and legumes -- to help facilitate muscle growth. According to fitness professional Lee Hayward, bodybuilders should consume at least 1 g of protein per pound of body weight on a daily basis, and many bodybuilders strive for even more.\n" +
                            "\n" +
                            "Step 2\n" +
                            "Consume complex carbohydrates such as oatmeal, whole grain bread, sweet potatoes, vegetables, whole grain pasta and brown rice, and minimize your intake of simple carbohydrates from sweets and desserts. Complex carbohydrates provide sustained energy for your workouts, and -- according to elitefitness.com -- are less likely to be stored as fat compared to their fast-digesting counterparts.\n" +
                            "\n" +
                            "Step 3\n" +
                            "Eat five to six small meals per day instead of three large ones; avoid going long periods of time without eating. Frequent meals ensure your muscles receive the steady stream of nutrition they need to repair and grow.\n" +
                            "\n" +
                            "Tips\n" +
                            "Although building lean mass is possible through diet and exercise alone, many bodybuilders choose to supplement their diets with glutamine, multivitamins, creatine or protein powder as a way to enhance muscle growth.\n" +
                            "Warnings\n" +
                            "Before embarking on your bodybuilding path, schedule a physical with your doctor to check for any health conditions that could make intense weightlifting dangerous. Avoid a high protein intake if you have kidney or liver disease.";
                }
                else if(myListView.getItemAtPosition(position).toString().trim().equals("Beauty")) {
                  paragraph =  "Eye Cream Is Great For Cuticles\n" +
                          "\n" +
                          "Instead of spending money on cuticle cream, you can use extra-moisturizing and hydrating eye cream to cure dry cuticles.\n" +
                          "\n" +
                          "Stop Your Hair Colour From Fading\n" +
                          "\n" +
                          "If you've just had your hair dyed, the last thing you want is for the colour to fade. One surefire way to prevent such a mishap from happening? Use a deep-conditioning treatment once a month. This will help lock in colour and has the added benefit of staving off dry and damaged locks.\n" +
                          "\n" +
                          "Avoid Overly Rosy Cheeks\n" +
                          "\n" +
                          "Giving yourself a natural glow avec blush is an in look for spring. But you'll want to avoid brushing on too much (lest you look like a clown). So always start your blush line two finger widths away from your nose and only apply it on the apples of your cheeks. This will ensure you create a natural glow without going overboard.\n" +
                          "\n" +
                          "Give Curls Bounce\n" +
                          "\n" +
                          "Never brush curls out with a brush. Instead, loosen them with your fingers. This will give curls added lift without flattening them down.\n" +
                          "\n" +
                          "Add Oomph To Cheekbones\n" +
                          "\n" +
                          "To make your cheekbones appear higher and to give them more structure, apply bronzer directly under the cheekbone. You can also add highlighter to the cheekbone itself (under a thin layer of blush).\n" +
                          "\n" +
                          "Give Hair Lift\n" +
                          "\n" +
                          "Before you start blow drying your hair, add a volumizing spray to your roots. This will give your locks some added lift.\n" +
                          "\n" +
                          "Create Fuller Lips\n" +
                          "\n" +
                          "If you're sick of having thin, pursed puckers, extend your lip line using a neutral-toned lip liner. Then apply lipstick over top. Be careful though -- don't extend your lip line too much.\n" +
                          "\n" +
                          "Nix Flaky Mascara\n" +
                          "\n" +
                          "One of the main reasons mascara will flake onto your face after you apply it is because it's old. Opt for a new container and always remember to keep your mascara tube tightly sealed.\n" +
                          "\n" +
                          "Dry Out Pimples\n" +
                          "\n" +
                          "Believe it or not, dabbing toothpaste onto a pimple is a quick and easy way to dry it out.\n" +
                          "\n" +
                          "Don't Believe Beauty Labels\n" +
                          "\n" +
                          "Some beauty labels actually display false information, so don't believe everything you read. If a product promises instant results or all-day protection, it may be too good to be true.\n" +
                          "\n" +
                          "Banish Oil\n" +
                          "\n" +
                          "The fastest way to clear your skin of any oily breakout, especially in the summer, is to use blotting papers. They'll clean up the excess oil on your epidermis and will prevent breakouts.\n" +
                          "\n" +
                          "Use Oil On Your Skin.. Even If It's Already Oily\n" +
                          "\n" +
                          "This probably sounds crazy, but using an oil-based product to remove makeup or excess dirt from your skin can actually improve your epidermis' condition. Why? Over-cleaning stimulates the sebum glands, which causes skin to over-produce oil. Using oil-based products will have the opposite effect.\n" +
                          "\n" +
                          "You Can Use Exfoliator Daily\n" +
                          "\n" +
                          "Exfoliation is an important and easy way to buff away the dead skin cells that cover up your skin's natural glow. Use a light exfoliator, like the Daily Microfoliant from Dermalogica, to freshen your face daily.\n" +
                          "\n" +
                          "If You Have Greasy Hair...\n" +
                          "\n" +
                          "Avoid applying conditioner directly to your hair's roots -- just apply the heavy moisturizing cream to your locks' ends.\n" +
                          "\n" +
                          "Clean Your Makeup Tools\n" +
                          "\n" +
                          "Whether you use a razor, a Q-tip or a powder brush, make sure to clean your beauty tools. After even a couple uses, they become breeding grounds for bacteria, which can cause breakouts, eczema and many other skin conditions.\n" +
                          "\n" +
                          "Remove Nail Polish Without Remover\n" +
                          "\n" +
                          "If you run out of nail polish remover, you can remove cracked or chipped nail polish by applying a clear top coat to the nail and removing it promptly with a cotton ball.\n" +
                          "\n" +
                          "Change It Up\n" +
                          "\n" +
                          "Our skin craves different things depending on the time of year. So change up your beauty routine based on the seasons. In the winter, add more moisturizing creams to your daily beauty list. In summer, ensure you're using lots of SPF.\n" +
                          "\n" +
                          "Apply Bronzer Evenly\n" +
                          "\n" +
                          "Before applying bronzer or self-tanning lotion, mix a drop or two of the solution with moisture cream. Blend using your finger or a Q-tip then apply to skin as you would regular moisturizer. This will ensure the cream blends in -- and covers skin -- evenly.\n" +
                          "\n" +
                          "Hide Split Ends\n" +
                          "\n" +
                          "To make split ends less noticeable, apply a heavy hair repair cream to lock in moisture before and after using a flat iron or a blow-dryer.\n" +
                          "\n" +
                          "Lock It In\n" +
                          "\n" +
                          "When using cream-based beauty products -- like lipstick or foundation -- apply a dry face powder on top to seal in your look. This also works for blush (apply a cream blush to cheeks, then top with a dry blush).\n" +
                          "\n" +
                          "Find Your Shade\n" +
                          "\n" +
                          "When choosing a foundation, test a product on the skin near your jawline. And be sure to do it in natural light. This will ensure the foundation tone you choose for your face isn't too different from the natural shade of your neck.\n" +
                          "\n" +
                          "Stop Taking Supplements\n" +
                          "\n" +
                          "It's true the healthier you are, the healthier your skin and hair will be. But popping supplements without discussing them with your doctor can do more harm than good. Why? Because mixing certain vitamins and minerals can have the opposite effect of what you're hoping. Talk to your doc before popping any pills.\n" +
                          "\n" +
                          "Using Eyeshadow Primer\n" +
                          "\n" +
                          "Primer is a great tool that will help you lock your makeup look in place. But adding too much of it on areas of your face where you won't actually apply colour will actually detract from the look you're going for (mostly because primers are brighter in tone than most makeup shades).\n" +
                          "\n" +
                          "Apply Mascara To Fake Lashes\n" +
                          "\n" +
                          "This will help fake lashes blend in a bit more seamlessly with your natural ones.\n" +
                          "\n" +
                          "Clarify Your Hair\n" +
                          "\n" +
                          "In order to remove product build-up from locks, use a clarifying shampoo once a week. This will also help prevent dandruff and other annoying hair/scalp conditions.\n" +
                          "\n" +
                          "Cut Back On Pedicures\n" +
                          "\n" +
                          "Save money on your beauty routine by taking care of your feet on a daily basis. Simply scrub your foot with a pumice stone each morning in the shower. Once you step out and dry off, apply a moisture cream to your feet. This will increase the amount of time you can go without a pedicure and will keep your toes healthy and fungus-free.\n" +
                          "\n" +
                          "Replace Old Products Regularly\n" +
                          "\n" +
                          "The effectiveness of products -- not to mention the amount of bacteria they breed -- wares after only a few months. Ditch old items and replace them with new ones.\n" +
                          "\n" +
                          "Treat Ingrown Hairs\n" +
                          "\n" +
                          "Apply a product containing azulene or witch hazel to help reduce the swelling and redness that's associated with ingrown hairs. From there, coax the ingrown hair from its location with a pair of tweezers (don't pull it out, though -- this will only make the ingrown hair regrow in in the same way later).\n" +
                          "\n" +
                          "Nix Post-Shaving Redness\n" +
                          "\n" +
                          "Shave your face, legs or underarms in the shower after standing under warm water for a few minutes. This will help open up hair follicles and will soften hairs so they're less coarse to shave.\n" +
                          "\n" +
                          "Soften Skin\n" +
                          "\n" +
                          "Immediately after stepping out of a shower, pool or lake/ocean, apply some sort of cream to skin. Water washes away the skin's natural oils and applying moisture cream will prevent skin chapping.\n" +
                          "\n" +
                          "Suggest a correction\n" ;

                }
                else if(myListView.getItemAtPosition(position).toString().trim().equals("Cooking")) {
                    paragraph =  " 10 quick ways for you to become a better cook based on my experiences creating this book. Start here, then cook your way through the recipes, and chances are you’ll be wowing your loved ones with food that you can’t believe you made yourself. Trust me: if I can do it, you can do it too.\n" +
                            "\n" +
                            "Cook Often. The best chefs are the best chefs because they spend most of their time cooking. Looking at all of the chefs who I met and cooked with while writing this book, almost every single one either went to culinary school or grew up in a family of cooks. That makes sense because in both cases they had to make the same dishes over and over again until they had those dishes mastered. That repetition reinforces basic techniques — sharpening your knife, seasoning properly, getting your pans hot — techniques that resonate throughout a lifetime of cooking. So if you say “I’m a bad cook,” chances are it’s because you don’t cook often enough. Make yourself cook at least three times a week and watch your skills improve immeasurably.\n" +
                            "Make What You Like. Too often people who don’t cook finally set out to make dinner and choose the healthiest, most punishing recipe imaginable because they’re on a diet or squeamish about making something with fat (how else are boneless, skinless chicken breasts so popular?) This is totally the wrong way to go about it. When you cook, especially if you’re a beginner, you should make things that are over the top delicious. Extra cheesy lasagna. Balsamic-glazed spareribs (one of the recipes in my book). Dark, decadent chocolate cake. When you make food that pleases you, chances are it will please others and the ensuing praise will make you want to cook again. And next time you cook, you can scale back a little on the fat without making the food punishing. The key, though, is making something that you yourself want to eat. All of the chefs I cooked with made food that they themselves loved. That’s not a coincidence.\n" +
                            "Tap Into Your Roots. America is a melting pot and it’s easy to divorce ourselves from our cultural heritage when we choose what to eat. Who can blame us, with so many cuisines represented in the mall food court alone? But sometimes it’s important to study your own personal heritage in order to discover your inner chef. Lidia Bastianich cooks Italian food not because it’s a gimmick or because Italian food is trendy; she cooks it because she’s so deeply connected to her roots. Same for so many other chefs in my book. If you’re looking for a place to start, think about your own family’s history and how you can pay tribute to that on the plate.\n" +
                            "Use The Right Tools. Celebrated San Francisco chef Gary Danko told me that, “the right tool can save you a lot of time.” That’s undeniably true, especially when it comes to the most basic techniques: chopping, sautéing, flipping something over in the pan. Start with your knife. According to Harold Dieterle (winner of Top Chef season one), beginners should use a German knife, more advanced cooks a Japanese knife. Sharpen your knife the way that Susan Feniger taught me; then steel your knife like Sara Moulton. A sharp knife is probably the most essential tool you can have in the kitchen. Once you experience a properly sharpened knife, you’ll understand, on a deeper level, how important it is to use the correct tool for all your kitchen tasks.\n" +
                            "Spend More Than You Normally Would on Food. Many of you might balk at this (“In this economy? I’ve got eight kids to feed!”) and I understand your resistance to this advice. But it’s undeniable that the best chefs use the best ingredients. Often times, much of what they do is more a matter of shopping than it is actual cooking (see Nancy Silverton’s salad of Prosciutto San Daniele, Warren pear, pomegranate seeds and the very best olive oil). Now when I shop for ingredients, I consider it a special indulgence to buy something a little bit nicer than I would normally buy. Think of it as a not-so-terrible vice: some people do recreational drugs. Others spend a small fortune on video game consoles. Is it really so terrible to spend an extra $15 on really good olive oil? Or the best balsamic vinegar? The difference it brings to your cooking will be huge.\n" +
                            "Be Bold. When people ask how my cooking changed after writing this book, I have a fast answer: “It became bolder.” That’s because chefs, by nature, take food right to the edge: when they brown butter (like Samin Nosrat did for her butternut squash tortellini), they take it just to the point before it’s burned; when they add salt to something, they add more salt than you or I would, but not so much that it tastes salty. They know that point where just a drop more would be too much and stop there. Learning that art is probably the biggest skill you can develop to make your food taste more like restaurant food.\n" +
                            "Think Visually. When Chuy Valencia in Chicago makes a tamale, he opens up the wrapper and tops it with a squiggle of tomatillo salsa, a squiggle of sour cream, slices of red radish and a sprinkling of cilantro. When Daniel Patterson at San Francisco’s Coi plates his dish of grilled broccoli and cauliflower, he places everything along the border of the plate, shaping it like the letter C, something I would never think to do myself. But these stylistic gestures have a purpose: they make the food more alluring. The more that I cooked with the chefs, the more that I discovered that the visual often matters as much as how the food tastes. And it makes sense that so many chefs that I cooked with (Renee Erickson in Seattle, Anthony Martin in Chicago) started out as visual artists.\n" +
                            "Have an Audience. One thing that I learned during the recipe testing phase of my cookbook is that cooking is much easier, and more rewarding, with an audience. If you’re cooking for one, chances are you won’t go through the trouble it takes to take your food to the highest level. If you’re cooking for two, there’s a chance your significant other may not really appreciate all of your effort. Which is why the more people you invite over, the more people you feed, the higher the stakes and, therefore, the more likely you are to learn. Example: Hugue Dufour, the chef at M. Wells, taught me how to make bone marrow with a red wine shallot puree, escargot and garlic, parsley breadcrumbs. This is not a dish I would ever make for myself. It’s not a dish I would ever make for myself and my partner. But when I invited a group of friends over to try it? I was suddenly motivated to make it; and when I brought the marrow bones to the table, golden brown on top, I felt like I’d advanced a level in the video game called FANCY COOKING AT HOME. All because I had an audience.\n" +
                            "Be An Adventurous Eater. You can’t learn all there is to learn about food unless you’re an open-minded eater. Amanda Cohen, who’s a vegetarian and the chef of a vegetarian restaurant (Dirt Candy, in New York) will eat meat dishes at fine dining restaurants just so she can learn the flavor profiles of those dishes and spin them into vegetarian dishes for her customers. Almost every chef that I met was an adventurous eater; their adventures, in turn, informed their food.\n" +
                            "Pour Yourself a Glass of Wine. Even though it was early in the morning when I cooked with José Andrés at his home, the first thing that he did was have me juice oranges and grapefruit for a cocktail that he improvised with Hendrick’s gin, brown sugar and Prosecco. We toasted our glasses before proceeding with the other dishes and that immediately set a tone, in the kitchen, of conviviality that was echoed, throughout my time on the road, in various kitchens across the country, usually with a glass of wine. Drink while you cook? Well, yes. Not to excess, of course, but the point is that cooking itself should be a pleasure, not a chore. A glass of wine signals that. And after cooking with 50 chefs, testing 150 recipes, and finessing 400 pages of this cookbook, cooking still is a pleasure. I’ll drink to that.\n" ;

                }
                else if(myListView.getItemAtPosition(position).toString().trim().equals("Photography")) {
                    paragraph =  "Do you wish you were a better photographer? All it takes is a little know-how and experience. Keep reading for some important picture-taking tips. Then grab your camera and start shooting your way to great pictures.\n" +
                            "\n" +
                            "Look your subject in the eye\n" +
                            "Use a plain background\n" +
                            "Use flash outdoors\n" +
                            "Move in close\n" +
                            "Move it from the middle\n" +
                            "Lock the focus\n" +
                            "Know your flash’s range\n" +
                            "Watch the light\n" +
                            "Take some vertical pictures\n" +
                            "Be a picture director\n" +
                            "\n" +
                            "Look your subject in the eye\n" +
                            "\n" +
                            "Direct eye contact can be as engaging in a picture as it is in real life. When taking a picture of someone, hold the camera at the person’s eye level to unleash the power of those magnetic gazes and mesmerizing smiles. For children, that means stooping to their level. And your subject need not always stare at the camera. All by itself that eye level angle will create a personal and inviting feeling that pulls you into the picture.\n" +
                            "Use a plain background\n" +
                            "\n" +
                            "A plain background shows off the subject you are photographing. When you look through the camera viewfinder, force yourself to study the area surrounding your subject. Make sure no poles grow from the head of your favorite niece and that no cars seem to dangle from her ears.\n" +
                            "Use flash outdoors\n" +
                            "\n" +
                            "Bright sun can create unattractive deep facial shadows. Eliminate the shadows by using your flash to lighten the face. When taking people pictures on sunny days, turn your flash on. You may have a choice of fill-flash mode or full-flash mode. If the person is within five feet, use the fill-flash mode; beyond five feet, the full-power mode may be required. With a digital camera, use the picture display panel to review the results.\n" +
                            "Move in close\n" +
                            "\n" +
                            "If your subject is smaller than a car, take a step or two closer before taking the picture and zoom in on your subject. Your goal is to fill the picture area with the subject you are photographing. Up close you can reveal telling details, like a sprinkle of freckles or an arched eyebrow. But don’t get too close or your pictures will be blurry. The closest focusing distance for most cameras is about three feet, or about one step away from your camera. If you get closer than the closest focusing distance of your camera (see your manual to be sure), your pictures will be blurry.\n" +
                            "Move it from the middle\n" +
                            "\n" +
                            "Center-stage is a great place for a performer to be. However, the middle of your picture is not the best place for your subject. Bring your picture to life by simply moving your subject away from the middle of your picture. Start by playing tick-tack-toe with subject position. Imagine a tick-tack-toe grid in your viewfinder. Now place your important subject at one of the intersections of lines. You’ll need to lock the focus if you have an auto-focus camera because most of them focus on whatever is in the center of the viewfinder.\n" +
                            "Lock the focus\n" +
                            "\n" +
                            "If your subject is not in the center of the picture, you need to lock the focus to create a sharp picture. Most auto-focus cameras focus on whatever is in the center of the picture. But to improve pictures, you will often want to move the subject away from the center of the picture. If you don’t want a blurred picture, you’ll need to first lock the focus with the subject in the middle and then recompose the picture so the subject is away from the middle.\n" +
                            "Usually you can lock the focus in three steps. First, center the subject and press and hold the shutter button halfway down. Second, reposition your camera (while still holding the shutter button) so the subject is away from the center. And third, finish by pressing the shutter button all the way down to take the picture.\n" +
                            "Know your flash’s range\n" +
                            "\n" +
                            "The number one flash mistake is taking pictures beyond the flash’s range. Why is this a mistake? Because pictures taken beyond the maximum flash range will be too dark. For many cameras, the maximum flash range is less than fifteen feet—about five steps away.\n" +
                            "What is your camera’s flash range? Look it up in your camera manual. Can’t find it? Then don’t take a chance. Position yourself so subjects are no farther than ten feet away. Film users can extend the flash range by using Kodak Max versatility or versatility plus film.\n" +
                            "Watch the light\n" +
                            "\n" +
                            "Next to the subject, the most important part of every picture is the light. It affects the appearance of everything you photograph. On a great-grandmother, bright sunlight from the side can enhance wrinkles. But the soft light of a cloudy day can subdue those same wrinkles.\n" +
                            "Don’t like the light on your subject? Then move yourself or your subject. For landscapes, try to take pictures early or late in the day when the light is orangish and rakes across the land.\n" +
                            "Take some vertical pictures\n" +
                            "\n" +
                            "Is your camera vertically challenged? It is if you never turn it sideways to take a vertical picture. All sorts of things look better in a vertical picture. From a lighthouse near a cliff to the Eiffel Tower to your four-year-old niece jumping in a puddle. So next time out, make a conscious effort to turn your camera sideways and take some vertical pictures.\n" +
                            "\n" +
                            "Be a picture director\n" +
                            "\n" +
                            "Take control of your picture-taking and watch your pictures dramatically improve. Become a picture director, not just a passive picture-taker. A picture director takes charge. A picture director picks the location: “Everybody go outside to the backyard.” A picture director adds props: “Girls, put on your pink sunglasses.” A picture director arranges people: “Now move in close, and lean toward the camera.”\n" +
                            "Most pictures won’t be that involved, but you get the idea: Take charge of your pictures and win your own best picture awards.\n" +
                            "\n" +
                            "\n" ;

                }
                else if(myListView.getItemAtPosition(position).toString().trim().equals("Doodling")) {
                    paragraph =  "Tips for Doodling\n" +
                            "Basics\n" +
                            "1\n" +
                            "Have the right tools. If you want to be a master doodler, then you should be prepared to doodle wherever you go. Inspiration -- or boredom -- can strike at any moment, not just in your third period history class, so you should always be prepared to start doodling. You should always carry a notebook around, along with a few tools. You can begin with a few basic tools and use more artistic tools as your doodling skills improve. Here are some great tools to doodle with:\n" +
                            "Simple supplies:\n" +
                            "Pencil\n" +
                            "Ink Pen\n" +
                            "Highlighter\n" +
                            "Marker\n" +
                            "Ballpoint pen\n" +
                            "Artist supplies:\n" +
                            "Charcoal\n" +
                            "Chalk\n" +
                            "Coloured Pencils\n" +
                            "Paint\n" +
                            "Pastels\n" +
                            "\n" +
                            "2\n" +
                            "Get inspired. As soon as you feel the urge to doodle, just put your pen to the paper and get started. Whether you're thinking of an act, an event, a feeling, a person, a place, a song, or even your own name, you should just put your pen to the paper and start drawing to see what you come up with. When the urge to doodle strikes, don't ignore it (unless it's not appropriate for you to doodle), or the feeling may pass.\n" +
                            "You'll find that you can also become inspired after you begin to doodle. You don't have to wait for the feeling that tells you to doodle -- you can just start doodling and feel the inspiration seep into your pores.\n" +
                            "\n" +
                            "3\n" +
                            "Associate freely. You don't have to stick to doodling just flowers, puppies, or your own last name. You can start by doodling a garden of flowers, then think of your best friend Mary Flowers and start drawing her pet poodle, Pork Chop, who makes you think of the delicious pork chop dinner you had last night...just start with one image and keep drawing whatever pops into your head.\n" +
                            "You don't have to stick to one theme or concept. No one is judging you -- and it's likely that no one will even see your doodles, so feel free to draw whatever you want.\n" +
                            "\n" +
                            "DOODLING OF VARIETY OF OBJECTS\n" +
                            "1\n" +
                            "Doodle flowers. Flowers are a popular item for doodling because there are endless variety of flowers and they are fun and easy to draw. Here are some ways you can draw flowers:\n" +
                            "Draw a vase and fill it with your own bouquet of flowers.\n" +
                            "Draw a garden that is filled with unique flowers.\n" +
                            "Draw a field of sunflowers with a sun shining down on them.\n" +
                            "Draw a rose bush surrounded by rose petals.\n" +
                            "Draw daisies. Cross off some of the petals and play \"He loves me, he loves me not.\"\n" +
                            "Write your own name or another word in simple flowers.\n" +
                            "2\n" +
                            "Doodle faces. Faces are more complicated to draw than most flowers, but you'll feel rewarded when you've truly learned to draw a face. You can draw the face of your teacher or your classmate, or just have fun drawing a random face. Here are some other ways to doodle faces:\n" +
                            "Practice drawing almost the same face with different expressions. This will help you get to know the face you're doodling.\n" +
                            "Doodle a face of a person you know from memory, whether it's your crush or favorite celebrity. Later, you can compare the doodle to the actual person and see how well you did.\n" +
                            "Doodle parts of a face. Draw an entire page of eyeballs, lips, or noses, and see how much you learn.\n" +
                            "Doodle a caricature. Draw a face with silly, exaggerated features.\n" +
                            "3\n" +
                            "Doodle your name. Your name is another popular thing to doodle. There are a variety of ways to doodle your name, whether you're writing it over and over again in the same way, or writing your name in a completely new way every time. Here are some ways to doodle your name:\n" +
                            "Write your name in cursive. Try writing it with exaggerated loops.\n" +
                            "Try writing your name as small as you possibly can while making it still legible.\n" +
                            "Write different versions of your name that abbreviate your first, middle, or last name. For example: \"Jean M. Carmen,\" \"J. M. Carmen,\" or \"Jean Marie C.\"\n" +
                            "Write your first name along with the last name of your crush. This will help you see if you're a match made in heaven.\n" +
                            "Write your name in big block letters. Decorate the block letters with vines, stars, planets, or hearts.\n" +
                            "Write your name in bubble letters. Have soap bubbles floating off the top of your name.\n" +
                            "4\n" +
                            "Doodle animals. Animals are another fun thing to doodle, and there are endless possibilities to covering your pages with cute or scary creatures. You can draw your pet dog, create a creature of your own, or even turn an ordinary kitty into a monster. Here are some other ways to doodle animals:\n" +
                            "Doodle underwater creatures. Draw an ocean and place all of the underwater creatures you can think of, from jellyfish to sharks, in this fun seascape.\n" +
                            "Doodle jungle creatures. Create your own jungle filled with parakeets, monkeys, snakes, and any jungle creatures you can think of.\n" +
                            "Turn ordinary creatures into monsters. Doodle a collection of cute kitties, puppies, and bunnies, and then have fun giving them fangs, evil eyes, and devil's horns.\n" +
                            "Doodle your favorite pet. Are you obsessed with your dog? Draw him in a variety of cute poses.\n" +
                            "Doodle your dream pet. Draw the pet you'd like to have the most, even if it's completely impractical. You can even name him and write his name around him in bubble letters.\n" +
                            "Doodle a hybrid creature. Draw a dog with a lamb's head, a leopard with a peacock's tail, or a fish with an alligator snout.\n" +
                            "5\n" +
                            "Doodle what you see. Have fun doodling whatever you see in front of you, whether it's your teacher, your classmates, the board, or the world outside your classroom. You can find a lot of originality in the ordinary objects right in front of you. Here are some other things to doodle:\n" +
                            "The contents of your pencil case\n" +
                            "The expression on your teacher's face\n" +
                            "The clouds or sun outside your window\n" +
                            "The trees outside your window\n" +
                            "Anything hanging on the wall in front of you\n" +
                            "Your other hand\n" +
                            "6\n" +
                            "Doodle what you hear. A fun way to free associate while you're doodling is to listen to whatever your teacher or the people around you are saying and to doodle the things that you're hearing about. Here are some ways to doodle what you hear:\n" +
                            "Doodle a historical figure. If your teacher is talking about George Washington, draw him in a variety of poses.\n" +
                            "Doodle a person you've never met. If you hear two people discussing a person with a funny name, just imagine what he would look like and draw him.\n" +
                            "Doodle a concept. What do you think of when your teacher says, \"embargo\" or \"bell curve\"? You don't have to doodle what the object actually is -- just doodle what it makes you picture in your head.\n" +
                            "Doodle a song. Did someone walk into the classroom with that song that always gets stuck in your head blaring from his headphones? Draw whatever it is the song makes you think about.\n" +
                            "7\n" +
                            "Doodle a cityscape. Cityscapes are fun to doodle and are perfect for the bottom or top margins of your pages. Draw a cityscape along the top of your notebook page, and have fun adding all of the little details that make it unique. Here are some things you can do when you doodle a cityscape:\n" +
                            "Make it night. The city looks the most beautiful at night, so draw a full moon and shade the sky in a dark color.\n" +
                            "Draw little windows in all of the houses. Some will be lit and some won't be.\n" +
                            "Add more details. Add trees, lamps, phone booths, trash cans, and even people walking their dogs on the streets outside the city.\n" +
                            "Draw a city you love. Think you know exactly what the New York cityscape looks like? Try drawing it and see how accurate you were later.\n" +
                            "8\n" +
                            "Create your own doodle world. As you become a more experienced doodler, you can create your own world, with your own people, your own animals, your own buildings, and your own trees in it. As you become more experienced, your creatures, thoughts, and people will begin to take on their own form and everyone will be able to recognize them as yours.\n" +
                            "Once you're a professional doodler, you can spread your love for doodling to others. Become an after-school doodle coach and share your love for doodling with others.\n" +
                            "You can even name your own world something like, \"Megland,\" or \"Walt's World,\" and write this name on top of your doodles.\n" +
                            "You can create a collage of your doodles in your room by taping the pages to your wall and being proud of all the doodling you've done.\n" ;

                }
                else if(myListView.getItemAtPosition(position).toString().trim().equals("DrivingTips")) {
                    paragraph =  "TIPS TO BECOME A GOOD DRIVER:\n" +
                            "\n" +
                            "Every time you get behind the wheel, you're operating a very dangerous piece of machinery. Whether you're an experienced driver or you've just finished driver's ed class, there's always room for improvement when it comes to driving. Here are ten things you can do to hone your safe, smart driving skills.\n" +
                            "10. Take a Defensive Driving Course\n" +
                            "Not only can online driving courses聽save you money on your car insurance or take points off your driving record, they're actually pretty good refresher courses for anyone who's been driving for a while and the answers to those driver's license tests are just a hazy memory. Do you know how to eyeball how far ahead the vehicle in front of you should be based on your speed? Know the difference between a DUI and a DWI and how many drinks can impair you for each? Stuff like that is covered in these courses, usually around $35.\n" +
                            "9. Park with Precision\n" +
                            "Parking is (usually) easy once you get the hang of it, but in tight spots or when you're new to driving backwards, it helps to know a few tricks. Here's an聽infographic on parallel, reverse, and forward parking; and聽step-by-step directions聽for parallel parking. If you'd like even more help when parking, consider聽these DIY sonic sensors for your car.\n" +
                            "8. Keep Your Hands on the Wheel at the Proper Positions\n" +
                            "For decades, driving instructors taught students to keep their hands on the steering wheel at the 10 and 2 positions on the clock. In the last few years,聽those guidelines have changed, so you're now supposed to keep your hands lower, at either 9 and 3 or 8 and 4. This gives you more control and stability when driving, and is also the most ergonomic position to hold your hands for long periods of time. Muscles more relaxed and having more control over your vehicle? Instantly, you're a better driver.\n" +
                            "7. Adjust Your Mirrors to Cover Your Blind Spots\n" +
                            "Similar to the above, there's a better way to position your mirrors than you might have been taught:聽Adjust the side mirrors so far outward聽so they're聽just聽overlapping your rearview mirror.聽Here's an illustration.\n" +
                            "6. Don't Drive When You're Sleepy (or Otherwise Not Alert)\n" +
                            "We all know the dangers of driving after drinking, but a serious lack of sleep聽could also impair you just as much聽(some people even聽sleep drive!)鈥攁nd one out of every six fatal crashes involved a drowsy driver,聽according to a study in 2010. Any time your mental facilities could be compromised鈥攚hether from alcohol, poor sleep, new medication, or even聽having a horrible cold鈥攊s a time to stay off the road or find an alternative to driving.\n" +
                            "5. Don't Bother Speeding\n" +
                            "We all want to get to our destinations sooner, but all speeding really does is increase your risk of getting into an accident or getting a speeding ticket, it turns out. Here's聽the math behind it, and why you're better off just driving at or below the recommended speeds.\n" +
                            "4. Know the Best Way to Merge in Traffic\n" +
                            "Inefficent lane merging causes traffic, road rage, and accidents. Some people are aggressive lane cutters, while others politely take their place in a lane long before an exit. The best, most efficient solution for all of us is to stay calm and聽zipper merge, each one taking our turn. (It was worth a try. At the very least, when merging or when others are trying to merge, be patient but also don't be that guy holding up a whole lane. We can work together to聽improve traffic for all.)\n" +
                            "3. Handle Tough Driving Conditions Like a Boss\n" +
                            "Even the most experienced drivers can get thrown off by hazardous conditions. Here's how to drive in聽extreme winter weather聽(including聽steering through slipperly snow), how to see better while聽driving at night,聽how to safely pass a car on a two-lane road, and why you should聽wear sunglasses聽but聽not use cruise control聽while it's raining.\n" +
                            "\n" +
                            "How Can I Drive Safely in Extreme Winter Weather?\n" +
                            "Dear Lifehacker, Where I live, snow just covered the entire city but I still need to get to work.鈥?/p>Read more\n" +
                            "2. Ditch the Distractions and Know Where You're Going\n" +
                            "\n" +
                            "By now, we all know texting while driving is both dangerous and聽against the law. It's possible to聽drive safely while using your cell phone, but you're better off just turning it off and sticking it in your bag if you don't need it for navigating. Your cell phone isn't the only problem, though. If you eat while you drive, fiddle with the radio, or have a too-talkative passenger, you won't be able to drive as well. The danger of texting while driving is rightfully getting alot of attention, but distracted driving in general is the main issue.\n" +
                            "Related to this: the distraction of not knowing where you are or exactly how to get where you want to go. Even with your phone's or car's navigation system, you could find yourself saying, \"Wait, which highway am I supposed to get on?\" and in a panic make a sudden, dangerous move. Try to scope out your route as much as possible before you start driving鈥攅ven聽using Google Street view聽so you're used to the landmarks and tricky intersections before you get in your car.\n" +
                            "1. Practice\n" +
                            "\n" +
                            "Finally, as the fine folks at Jalopnik point out in聽their driver skills article, the top way to become a better driver is to drive more鈥攃onscienciously, of course, keeping the above in mind. It is, after all, a skill鈥攐ne we shouldn't take too much for granted.\n" ;

                }
                else {
                    //setting value of the paragraph string
                    paragraph = "no value set";
                }

                //starting the new activity and passing the paragraph to the activity using the intent
                Intent i = new Intent(Tutorial.this, DisplayActivity.class);
                i.putExtra("paragraph", paragraph);
                startActivity(i);

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}