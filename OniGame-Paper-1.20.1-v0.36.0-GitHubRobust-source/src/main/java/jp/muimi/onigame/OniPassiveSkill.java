package jp.muimi.onigame;

public enum OniPassiveSkill {
    CRAVING("渇望", "追跡が続くほど段階的に移動速度が上昇"),
    BLOOD_SCENT("血嗅", "負傷したぷれいやーを一定間隔で短時間発光"),
    GUARDIAN("守護", "心臓が損壊された際の通知間隔を短縮"),
    PREDATION("捕食", "ぷれいやーを瀕死・脱落させるとスタミナ回復"),
    INTERFERENCE("妨害", "心臓損壊の成功判定を狭め、通常成功時に進行を後退"),
    MASTERY("熟達", "鬼スキルのクールタイムを短縮"),
    MOMENTUM("余勢", "鬼スキル発動時に少量のスタミナを回復"),
    ANCHOR("不動", "ノックバック耐性を上げ、正面戦闘や溜め技を安定化"),
    PULSE("脈動", "心臓損壊の警報を受けると短時間加速"),
    EXECUTION("狩印", "発光中の獲物へ与えるダメージが増加"),
    HUNT_RECORD("狩猟記録", "異なるぷれいやーを発見して記録。複数人を狩るほど索敵報酬を得る"),
    GRUDGE_RETURN("怨返し", "同じぷれいやーから妨害を受けると怨トークンを蓄積し、3個で次の妨害への耐性を得る"),
    BLOOD_MARK("血印", "攻撃したぷれいやーへ血印を刻む。3印の獲物を再攻撃すると回収して鬼スキルCTを短縮");

    public final String display;
    public final String description;

    OniPassiveSkill(String display,String description){this.display=display;this.description=description;}
}
