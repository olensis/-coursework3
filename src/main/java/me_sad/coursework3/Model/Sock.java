package me_sad.coursework3.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Sock {
    private Color color;
    private CottonPart cottonPart;
    private Size size;
    private int quantity;
}
