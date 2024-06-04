
// Source code is decompiled from a .class file using FernFlower decompiler.
import javax.swing.JFrame;
import javax.swing.JButton;

public class AntennaDesigner {
    JFrame frame;
    JButton file_button;
    JButton export_button;
    JButton help_button;
    // JButton create_schematic_button;
    // JButton create_trace_button;
    JButton create_button;
    // JButton insert_rad_button;
    JButton insert_button;
    // JButton configure_param_button;
    JButton configure_button;
    JButton exit_button;

    int open_frame_width = 800;
    int open_frame_height = 600;

    int bar_height = 0;

    int button_num = 0;
    int stand_btn_dist = 100;
    int stand_btn_width = stand_btn_dist;
    int stand_btn_height = 20;

    public AntennaDesigner() {
        this.frame = new JFrame("Antenna Designer");

        this.file_button = new JButton("File");
        this.file_button.setBounds(button_num, bar_height, stand_btn_width, stand_btn_height);
        this.frame.add(this.file_button);

        button_num += stand_btn_dist;

        this.export_button = new JButton("Export");
        this.export_button.setBounds(button_num, bar_height, stand_btn_width, stand_btn_height);
        this.frame.add(this.export_button);

        button_num += stand_btn_dist;

        this.help_button = new JButton("Help");
        this.help_button.setBounds(button_num, bar_height, stand_btn_width, stand_btn_height);
        this.frame.add(this.help_button);

        button_num += stand_btn_dist;

        // this.create_schematic_button = new JButton("Create Schematic");
        // this.create_schematic_button.setBounds(button_num, bar_height,
        // stand_btn_width, stand_btn_height);
        // this.frame.add(this.create_schematic_button);

        // button_num += stand_btn_dist;

        // this.create_trace_button = new JButton("Create Trace");
        // this.create_trace_button.setBounds(button_num, bar_height, stand_btn_width,
        // stand_btn_height);
        // this.frame.add(this.create_trace_button);

        this.create_button = new JButton("Create");
        this.create_button.setBounds(button_num, bar_height, stand_btn_width,
                stand_btn_height);
        this.frame.add(this.create_button);

        button_num += stand_btn_dist;

        // this.insert_rad_button = new JButton("Insert Rad Pattern");
        // this.insert_rad_button.setBounds(button_num, bar_height, stand_btn_width,
        // stand_btn_height);
        // this.frame.add(this.insert_rad_button);

        this.insert_button = new JButton("Insert");
        this.insert_button.setBounds(button_num, bar_height, stand_btn_width, stand_btn_height);
        this.frame.add(this.insert_button);

        button_num += stand_btn_dist;

        // this.configure_param_button = new JButton("Configure Parameters");
        // this.configure_param_button.setBounds(button_num, bar_height,
        // stand_btn_width, stand_btn_height);
        // this.frame.add(this.configure_param_button);

        this.configure_button = new JButton("Configure");
        this.configure_button.setBounds(button_num, bar_height, stand_btn_width, stand_btn_height);
        this.frame.add(this.configure_button);

        button_num += stand_btn_dist;

        this.exit_button = new JButton("Exit");
        this.exit_button.setBounds(button_num, bar_height, stand_btn_width, stand_btn_height);
        this.frame.add(this.exit_button);

        this.frame.setSize(open_frame_width, open_frame_height);
        this.frame.setLayout(null);
        this.frame.setVisible(true);

    }

    public static void main(String[] var0) {
        new AntennaDesigner();
    }
}
