package com.mfizaralfian.belajartunarungufizarapp.Model;

import com.mfizaralfian.belajartunarungufizarapp.R;

import java.util.ArrayList;

public class InformasiData {

        public static String[][] data = new String[][]{
                {String.valueOf(R.drawable.aa1),
                        String.valueOf(R.raw.music),
                        "Huruf : A",
                        " \n"

                },
                {String.valueOf(R.drawable.bb2),
                        String.valueOf(R.raw.music),
                        "Huruf : B",
                        " \n"
                },
                {String.valueOf(R.drawable.cc3),
                        String.valueOf(R.raw.music),
                        "Huruf : C",
                        " \n"  },
                {String.valueOf(R.drawable.dd4),
                        String.valueOf(R.raw.music),
                        "Huruf : D",
                        " \n"   },
                {String.valueOf(R.drawable.ee5),
                        String.valueOf(R.raw.music),
                        "Huruf : E",
                        " \n"  },
                {String.valueOf(R.drawable.ff6),
                        String.valueOf(R.raw.music),
                        "Huruf : F",
                        " \n"   },
                {String.valueOf(R.drawable.gg7),
                        String.valueOf(R.raw.music),
                        "Huruf : G",
                        " \n"  },
                {String.valueOf(R.drawable.hh8),
                        String.valueOf(R.raw.music),
                        "Huruf : H",
                        " \n"   },
                {String.valueOf(R.drawable.ii9),
                        String.valueOf(R.raw.music),
                        "Huruf : I",
                        " \n"   },
                {String.valueOf(R.drawable.jj10),
                        String.valueOf(R.raw.music),
                        "Huruf : J",
                        " \n"   },
                {String.valueOf(R.drawable.kk11),
                        String.valueOf(R.raw.music),
                        "Huruf : K",
                        " \n"   },
                {String.valueOf(R.drawable.ll12),
                        String.valueOf(R.raw.music),
                        "Huruf : L",
                        " \n"    },
                {String.valueOf(R.drawable.mm13),
                        String.valueOf(R.raw.music),
                        "Huruf : M",
                        " \n"  },
                {String.valueOf(R.drawable.nn14),
                        String.valueOf(R.raw.music),
                        "Huruf : N",
                        " \n"   },
                {String.valueOf(R.drawable.oo15),
                        String.valueOf(R.raw.music),
                        "Huruf : O",
                        " \n"   },
                {String.valueOf(R.drawable.pp16),
                        String.valueOf(R.raw.music),
                        "Huruf : P",
                        " \n"   },
                {String.valueOf(R.drawable.qq17),
                        String.valueOf(R.raw.music),
                        "Huruf : Q",
                        " \n"  },
                {String.valueOf(R.drawable.rr18),
                        String.valueOf(R.raw.music),
                        "Huruf : R",
                        " \n"   },
                {String.valueOf(R.drawable.ss19),
                        String.valueOf(R.raw.music),
                        "Huruf : S",
                        " \n"   },
                {String.valueOf(R.drawable.tt20),
                        String.valueOf(R.raw.music),
                        "Huruf : T",
                        " \n"   },
                {String.valueOf(R.drawable.uu21),
                        String.valueOf(R.raw.music),
                        "Huruf : U",
                        " \n"  },
                {String.valueOf(R.drawable.vv22),
                        String.valueOf(R.raw.music),
                        "Huruf : V",
                        " \n"   },
                {String.valueOf(R.drawable.ww23),
                        String.valueOf(R.raw.music),
                        "Huruf : W",
                        " \n"    },
                {String.valueOf(R.drawable.xx24),
                        String.valueOf(R.raw.music),
                        "Huruf : X",
                        " \n"  },
                {String.valueOf(R.drawable.yy25),
                        String.valueOf(R.raw.music),
                        "Huruf : Y",
                        " \n"   },
                {String.valueOf(R.drawable.zz26),
                        String.valueOf(R.raw.music),
                        "Huruf : Z",
                        " \n"   },

        };
        public static ArrayList<DataModel> getListData(){
                DataModel dm= null;
                ArrayList<DataModel> list = new ArrayList<>();
                for (String[] aData : data) {
                        dm = new DataModel();
                        dm.setGambar(aData[0]);
                        dm.setSuara(aData[1]);
                        dm.setTittle(aData[2]);
                        dm.setDeskripsi(aData[3]);
                        list.add(dm);
                }
                return list;
        }
}
