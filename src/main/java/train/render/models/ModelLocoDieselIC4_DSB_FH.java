package train.render.models;
//Exported java file
//Keep in mind that you still need to fill in some blanks
// - ZeuX

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelLocoDieselIC4_DSB_FH extends ModelBase
{
	//fields
	ModelRendererTurbo Left1;
	ModelRendererTurbo Left2;
	ModelRendererTurbo Left3;
	ModelRendererTurbo Left4;
	ModelRendererTurbo Floor1;
	ModelRendererTurbo Floor2;
	ModelRendererTurbo Floor3;
	ModelRendererTurbo Ceiling;
	ModelRendererTurbo Right1;
	ModelRendererTurbo Right2;
	ModelRendererTurbo Right3;
	ModelRendererTurbo Right4;
	ModelRendererTurbo Wheels1;
	ModelRendererTurbo Wheels2;
	ModelRendererTurbo Bottom;
	ModelRendererTurbo TranConnector1;
	ModelRendererTurbo TranConnector2;
	ModelRendererTurbo TranConnector3;
	ModelRendererTurbo TranConnector4;
	ModelRendererTurbo TrainConnector5;
	ModelRendererTurbo TrainConnector6;
	ModelRendererTurbo TrainConnector7;
	ModelRendererTurbo TrainConnector8;
	ModelRendererTurbo TrainConnector9;
	ModelRendererTurbo TrainConnector10;
	ModelRendererTurbo TranConnector11;
	ModelRendererTurbo TranConnector12;
	ModelRendererTurbo TrainConnector13;
	ModelRendererTurbo TrainConnector14;
	ModelRendererTurbo TranConnector15;
	ModelRendererTurbo TranConnector16;
	ModelRendererTurbo Stairs1;
	ModelRendererTurbo Stairs2;
	ModelRendererTurbo Stairs3;
	ModelRendererTurbo Walls1;
	ModelRendererTurbo Walls2;
	ModelRendererTurbo Walls3;
	ModelRendererTurbo Walls4;
	ModelRendererTurbo Walls5;
	ModelRendererTurbo Walls6;
	ModelRendererTurbo Walls7;
	ModelRendererTurbo Walls8;
	ModelRendererTurbo Walls9;
	ModelRendererTurbo Seats1;
	ModelRendererTurbo Seats2;
	ModelRendererTurbo Seats3;
	ModelRendererTurbo Seats4;
	ModelRendererTurbo Seats5;
	ModelRendererTurbo Seats6;
	ModelRendererTurbo Seats7;
	ModelRendererTurbo Seats8;
	ModelRendererTurbo Seats9;
	ModelRendererTurbo Seats10;
	ModelRendererTurbo Seats11;
	ModelRendererTurbo Seats12;
	ModelRendererTurbo Seats13;
	ModelRendererTurbo Seats14;
	ModelRendererTurbo Seats15;
	ModelRendererTurbo Seats16;
	ModelRendererTurbo Seats17;
	ModelRendererTurbo Seats18;
	ModelRendererTurbo Seats19;
	ModelRendererTurbo Seats20;
	ModelRendererTurbo Seats21;
	ModelRendererTurbo Seats22;
	ModelRendererTurbo Seats23;

	public ModelLocoDieselIC4_DSB_FH()
	{
		int textureWidth = 256;
		int textureHeight = 256;

		Left1 = new ModelRendererTurbo(this, 203, 0, textureWidth, textureHeight);
		Left1.addBox(0F, 0F, 0F, 2, 111, 6);
		Left1.setRotationPoint(9F, 18F, -1F);
		Left1.mirror = true;
		setRotation(Left1, 1.570796F, 0F, 0.2230717F);
		Left2 = new ModelRendererTurbo(this, 111, 0, textureWidth, textureHeight);
		Left2.addBox(0F, 0F, 0F, 2, 111, 15);
		Left2.setRotationPoint(10.1F, 13F, -1F);
		Left2.mirror = true;
		setRotation(Left2, 1.570796F, 0F, 0F);
		Left3 = new ModelRendererTurbo(this, 146, 0, textureWidth, textureHeight);
		Left3.addBox(0F, 0F, 0F, 2, 111, 6);
		Left3.setRotationPoint(10.25F, -1F, -1F);
		Left3.mirror = true;
		setRotation(Left3, 1.570796F, 0F, -0.2230717F);
		Left4 = new ModelRendererTurbo(this, 246, 146, textureWidth, textureHeight);
		Left4.addBox(0F, 0F, 0F, 1, 97, 4);
		Left4.setRotationPoint(9F, 22F, 6F);
		Left4.mirror = true;
		setRotation(Left4, 1.570796F, 0F, 0.2974289F);
		Floor1 = new ModelRendererTurbo(this, 0, 0, textureWidth, textureHeight);
		Floor1.addBox(0F, 0F, 0F, 20, 117, 1);
		Floor1.setRotationPoint(-10F, 18F, -4F);
		Floor1.mirror = true;
		setRotation(Floor1, 1.570796F, 0F, 0F);
		Floor2 = new ModelRendererTurbo(this, 12, 172, textureWidth, textureHeight);
		Floor2.addBox(0F, 0F, 0F, 20, 14, 3);
		Floor2.setRotationPoint(-9F, 17F, -1F);
		Floor2.mirror = true;
		setRotation(Floor2, 1.570796F, 0F, 0F);
		Floor3 = new ModelRendererTurbo(this, 12, 202, textureWidth, textureHeight);
		Floor3.addBox(0F, 0F, 0F, 20, 22, 3);
		Floor3.setRotationPoint(-9F, 18F, 88F);
		Floor3.mirror = true;
		setRotation(Floor3, 1.570796F, 0F, 0F);
		Ceiling = new ModelRendererTurbo(this, 164, 0, textureWidth, textureHeight);
		Ceiling.addBox(0F, 0F, 0F, 18, 111, 1);
		Ceiling.setRotationPoint(-8F, -6F, -1F);
		Ceiling.mirror = true;
		setRotation(Ceiling, 1.570796F, 0F, 0F);
		Right1 = new ModelRendererTurbo(this, 59, 0, textureWidth, textureHeight);
		Right1.addBox(0F, 0F, 0F, 2, 111, 6);
		Right1.setRotationPoint(-10F, 18.3F, -1F);
		Right1.mirror = true;
		setRotation(Right1, 1.570796F, 0F, -0.2230717F);
		Right2 = new ModelRendererTurbo(this, 76, 0, textureWidth, textureHeight);
		Right2.addBox(0F, 0F, 0F, 2, 111, 15);
		Right2.setRotationPoint(-11.2F, 13F, -1F);
		Right2.mirror = true;
		setRotation(Right2, 1.570796F, 0F, 0F);
		Right3 = new ModelRendererTurbo(this, 42, 0, textureWidth, textureHeight);
		Right3.addBox(0F, 0F, 0F, 2, 111, 6);
		Right3.setRotationPoint(-11F, -2F, -1F);
		Right3.mirror = true;
		setRotation(Right3, 1.570796F, 0F, 0.3346075F);
		Right4 = new ModelRendererTurbo(this, 234, 146, textureWidth, textureHeight);
		Right4.addBox(0F, 0F, 0F, 1, 97, 4);
		Right4.setRotationPoint(-9F, 22F, 6F);
		Right4.mirror = true;
		setRotation(Right4, 1.570796F, 0F, -0.2974289F);
		Wheels1 = new ModelRendererTurbo(this, 124, 186, textureWidth, textureHeight);
		Wheels1.addBox(0F, 0F, 0F, 6, 21, 10);
		Wheels1.setRotationPoint(11F, 18F, -5F);
		Wheels1.mirror = true;
		setRotation(Wheels1, 0F, 0F, 1.570796F);
		Wheels2 = new ModelRendererTurbo(this, 134, 151, textureWidth, textureHeight);
		Wheels2.addBox(0F, 0F, 0F, 6, 21, 11);
		Wheels2.setRotationPoint(11F, 18F, 104F);
		Wheels2.mirror = true;
		setRotation(Wheels2, 0F, 0F, 1.570796F);
		Bottom = new ModelRendererTurbo(this, 220, 0, textureWidth, textureHeight);
		Bottom.addBox(0F, 0F, 0F, 17, 95, 1);
		Bottom.setRotationPoint(-8F, 22F, 6F);
		Bottom.mirror = true;
		setRotation(Bottom, 1.570796F, 0F, 0F);
		TranConnector1 = new ModelRendererTurbo(this, 0, 114, textureWidth, textureHeight);
		TranConnector1.addBox(0F, 0F, 0F, 2, 16, 3);
		TranConnector1.setRotationPoint(-11F, -2F, -4F);
		TranConnector1.mirror = true;
		setRotation(TranConnector1, 0F, 0F, 0F);
		TranConnector2 = new ModelRendererTurbo(this, 0, 114, textureWidth, textureHeight);
		TranConnector2.addBox(0F, 0F, 0F, 2, 16, 3);
		TranConnector2.setRotationPoint(9.5F, -2F, -4F);
		TranConnector2.mirror = true;
		setRotation(TranConnector2, 0F, 0F, 0F);
		TranConnector3 = new ModelRendererTurbo(this, 0, 114, textureWidth, textureHeight);
		TranConnector3.addBox(0F, 0F, 0F, 2, 16, 3);
		TranConnector3.setRotationPoint(-11F, -2F, 110F);
		TranConnector3.mirror = true;
		setRotation(TranConnector3, 0F, 0F, 0F);
		TranConnector4 = new ModelRendererTurbo(this, 0, 114, textureWidth, textureHeight);
		TranConnector4.addBox(0F, 0F, 0F, 2, 16, 3);
		TranConnector4.setRotationPoint(9.5F, -2F, 110F);
		TranConnector4.mirror = true;
		setRotation(TranConnector4, 0F, 0F, 0F);
		TrainConnector5 = new ModelRendererTurbo(this, 0, 134, textureWidth, textureHeight);
		TrainConnector5.addBox(0F, 0F, 0F, 2, 5, 3);
		TrainConnector5.setRotationPoint(-9F, -6F, -4F);
		TrainConnector5.mirror = true;
		setRotation(TrainConnector5, 0F, 0F, 0.4461433F);
		TrainConnector6 = new ModelRendererTurbo(this, 0, 144, textureWidth, textureHeight);
		TrainConnector6.addBox(0F, 0F, 0F, 2, 3, 3);
		TrainConnector6.setRotationPoint(9.7F, 13F, -4F);
		TrainConnector6.mirror = true;
		setRotation(TrainConnector6, 0F, 0F, 0.4461433F);
		TrainConnector7 = new ModelRendererTurbo(this, 0, 144, textureWidth, textureHeight);
		TrainConnector7.addBox(0F, 0F, 0F, 2, 3, 3);
		TrainConnector7.setRotationPoint(-11F, 14F, -4F);
		TrainConnector7.mirror = true;
		setRotation(TrainConnector7, 0F, 0F, -0.4461433F);
		TrainConnector8 = new ModelRendererTurbo(this, 0, 144, textureWidth, textureHeight);
		TrainConnector8.addBox(0F, 0F, 0F, 2, 5, 3);
		TrainConnector8.setRotationPoint(-11F, 14F, 110F);
		TrainConnector8.mirror = true;
		setRotation(TrainConnector8, 0F, 0F, -0.4461433F);
		TrainConnector9 = new ModelRendererTurbo(this, 0, 144, textureWidth, textureHeight);
		TrainConnector9.addBox(0F, 0F, 0F, 2, 5, 3);
		TrainConnector9.setRotationPoint(9.5F, 13F, 110F);
		TrainConnector9.mirror = true;
		setRotation(TrainConnector9, 0F, 0F, 0.4461433F);
		TrainConnector10 = new ModelRendererTurbo(this, 0, 134, textureWidth, textureHeight);
		TrainConnector10.addBox(0F, 0F, 0F, 2, 5, 3);
		TrainConnector10.setRotationPoint(7.6F, -5F, -4F);
		TrainConnector10.mirror = true;
		setRotation(TrainConnector10, 0F, 0F, -0.4833219F);
		TranConnector11 = new ModelRendererTurbo(this, 120, 154, textureWidth, textureHeight);
		TranConnector11.addBox(0F, 0F, 0F, 2, 18, 3);
		TranConnector11.setRotationPoint(9F, -6F, -4F);
		TranConnector11.mirror = true;
		setRotation(TranConnector11, 0F, 0F, 1.570796F);
		TranConnector12 = new ModelRendererTurbo(this, 0, 176, textureWidth, textureHeight);
		TranConnector12.addBox(0F, 0F, 0F, 2, 20, 3);
		TranConnector12.setRotationPoint(10.2F, 15F, -4F);
		TranConnector12.mirror = true;
		setRotation(TranConnector12, 0F, 0F, 1.570796F);
		TrainConnector13 = new ModelRendererTurbo(this, 0, 200, textureWidth, textureHeight);
		TrainConnector13.addBox(0F, 0F, 0F, 2, 4, 3);
		TrainConnector13.setRotationPoint(8.2F, -4F, 110F);
		TrainConnector13.mirror = true;
		setRotation(TrainConnector13, 0F, 0F, -0.4833219F);
		TrainConnector14 = new ModelRendererTurbo(this, 0, 200, textureWidth, textureHeight);
		TrainConnector14.addBox(0F, 0F, 0F, 2, 4, 3);
		TrainConnector14.setRotationPoint(-9.4F, -5F, 110F);
		TrainConnector14.mirror = true;
		setRotation(TrainConnector14, 0F, 0F, 0.4833219F);
		TranConnector15 = new ModelRendererTurbo(this, 0, 208, textureWidth, textureHeight);
		TranConnector15.addBox(0F, 0F, 0F, 2, 19, 3);
		TranConnector15.setRotationPoint(10F, -5F, 110F);
		TranConnector15.mirror = true;
		setRotation(TranConnector15, 0F, 0F, 1.570796F);
		TranConnector16 = new ModelRendererTurbo(this, 0, 176, textureWidth, textureHeight);
		TranConnector16.addBox(0F, 0F, 0F, 2, 19, 3);
		TranConnector16.setRotationPoint(10F, 16F, 110F);
		TranConnector16.mirror = true;
		setRotation(TranConnector16, 0F, 0F, 1.570796F);
		Stairs1 = new ModelRendererTurbo(this, 76, 140, textureWidth, textureHeight);
		Stairs1.addBox(0F, 0F, 0F, 7, 2, 2);
		Stairs1.setRotationPoint(3F, 17.6F, 13F);
		Stairs1.mirror = true;
		setRotation(Stairs1, 1.570796F, 0F, 0F);
		Stairs2 = new ModelRendererTurbo(this, 96, 140, textureWidth, textureHeight);
		Stairs2.addBox(0F, 0F, 0F, 7, 1, 1);
		Stairs2.setRotationPoint(3F, 15.8F, 13F);
		Stairs2.mirror = true;
		setRotation(Stairs2, 1.570796F, 0F, 0F);
		Stairs3 = new ModelRendererTurbo(this, 96, 140, textureWidth, textureHeight);
		Stairs3.addBox(0F, 0F, 0F, 7, 1, 1);
		Stairs3.setRotationPoint(3F, 17.2F, 15F);
		Stairs3.mirror = true;
		setRotation(Stairs3, 1.570796F, 0F, 0F);
		Walls1 = new ModelRendererTurbo(this, 12, 146, textureWidth, textureHeight);
		Walls1.addBox(0F, 0F, 0F, 19, 23, 2);
		Walls1.setRotationPoint(-9F, -6F, -1F);
		Walls1.mirror = true;
		setRotation(Walls1, 0F, 0F, 0F);
		Walls2 = new ModelRendererTurbo(this, 12, 119, textureWidth, textureHeight);
		Walls2.addBox(0F, 0F, 0F, 19, 24, 2);
		Walls2.setRotationPoint(-9F, -6F, 108F);
		Walls2.mirror = true;
		setRotation(Walls2, 0F, 0F, 0F);
		Walls3 = new ModelRendererTurbo(this, 60, 150, textureWidth, textureHeight);
		Walls3.addBox(0F, 0F, 0F, 19, 24, 2);
		Walls3.setRotationPoint(-9F, -6F, 42F);
		Walls3.mirror = true;
		setRotation(Walls3, 0F, 0F, 0F);
		Walls4 = new ModelRendererTurbo(this, 60, 207, textureWidth, textureHeight);
		Walls4.addBox(0F, 0F, 0F, 19, 24, 2);
		Walls4.setRotationPoint(-9F, -6F, 74F);
		Walls4.mirror = true;
		setRotation(Walls4, 0F, 0F, 0F);
		Walls5 = new ModelRendererTurbo(this, 60, 178, textureWidth, textureHeight);
		Walls5.addBox(0F, 0F, 0F, 12, 24, 3);
		Walls5.setRotationPoint(-9F, -6F, 13F);
		Walls5.mirror = true;
		setRotation(Walls5, 0F, 0F, 0F);
		Walls6 = new ModelRendererTurbo(this, 91, 178, textureWidth, textureHeight);
		Walls6.addBox(0F, 0F, -1F, 15, 20, 1);
		Walls6.setRotationPoint(-6F, -6F, 1F);
		Walls6.mirror = true;
		setRotation(Walls6, 0F, -1.003822F, 0F);
		Walls7 = new ModelRendererTurbo(this, 104, 208, textureWidth, textureHeight);
		Walls7.addBox(0F, 0F, 0F, 7, 24, 1);
		Walls7.setRotationPoint(-4F, -6F, 60F);
		Walls7.mirror = true;
		setRotation(Walls7, 0F, -0.7807508F, 0F);
		Walls8 = new ModelRendererTurbo(this, 104, 150, textureWidth, textureHeight);
		Walls8.addBox(0F, 0F, 0F, 5, 24, 1);
		Walls8.setRotationPoint(-9F, -6F, 60F);
		Walls8.mirror = true;
		setRotation(Walls8, 0F, 0F, 0F);
		Walls9 = new ModelRendererTurbo(this, 160, 185, textureWidth, textureHeight);
		Walls9.addBox(0F, 0F, 0F, 1, 24, 9);
		Walls9.setRotationPoint(0F, -6F, 65F);
		Walls9.mirror = true;
		setRotation(Walls9, 0F, 0F, 0F);
		Seats1 = new ModelRendererTurbo(this, 56, 120, textureWidth, textureHeight);
		Seats1.addBox(0F, 0F, 0F, 3, 20, 1);
		Seats1.setRotationPoint(-9F, 17F, 20F);
		Seats1.mirror = true;
		setRotation(Seats1, 1.570796F, 0F, 0F);
		Seats2 = new ModelRendererTurbo(this, 66, 122, textureWidth, textureHeight);
		Seats2.addBox(0F, 0F, 0F, 3, 21, 1);
		Seats2.setRotationPoint(7F, 17F, 20F);
		Seats2.mirror = true;
		setRotation(Seats2, 1.570796F, 0F, 0F);
		Seats3 = new ModelRendererTurbo(this, 96, 132, textureWidth, textureHeight);
		Seats3.addBox(0F, 0F, 0F, 7, 1, 1);
		Seats3.setRotationPoint(-9F, 18F, 85F);
		Seats3.mirror = true;
		setRotation(Seats3, 1.570796F, 0F, 0F);
		Seats4 = new ModelRendererTurbo(this, 76, 136, textureWidth, textureHeight);
		Seats4.addBox(0F, 0F, 0F, 4, 1, 1);
		Seats4.setRotationPoint(-9F, 18F, 78F);
		Seats4.mirror = true;
		setRotation(Seats4, 1.570796F, 0F, 0F);
		Seats5 = new ModelRendererTurbo(this, 96, 136, textureWidth, textureHeight);
		Seats5.addBox(0F, 0F, 0F, 7, 1, 1);
		Seats5.setRotationPoint(-9F, 15F, 90F);
		Seats5.mirror = true;
		setRotation(Seats5, 1.570796F, 0F, 0F);
		Seats6 = new ModelRendererTurbo(this, 96, 136, textureWidth, textureHeight);
		Seats6.addBox(0F, 0F, -1F, 7, 1, 1);
		Seats6.setRotationPoint(3F, 14.3F, 98F);
		Seats6.mirror = true;
		setRotation(Seats6, 1.570796F, 0F, 0F);
		Seats7 = new ModelRendererTurbo(this, 96, 136, textureWidth, textureHeight);
		Seats7.addBox(0F, 0F, 0F, 7, 1, 1);
		Seats7.setRotationPoint(-9F, 15.5F, 98F);
		Seats7.mirror = true;
		setRotation(Seats7, 1.570796F, 0F, 0F);
		Seats8 = new ModelRendererTurbo(this, 96, 136, textureWidth, textureHeight);
		Seats8.addBox(0F, 0F, 0F, 7, 1, 1);
		Seats8.setRotationPoint(-9F, 15F, 106F);
		Seats8.mirror = true;
		setRotation(Seats8, 1.570796F, 0F, 0F);
		Seats9 = new ModelRendererTurbo(this, 96, 136, textureWidth, textureHeight);
		Seats9.addBox(0F, 0F, 0F, 7, 1, 1);
		Seats9.setRotationPoint(3F, 15F, 106F);
		Seats9.mirror = true;
		setRotation(Seats9, 1.570796F, 0F, 0F);
		Seats10 = new ModelRendererTurbo(this, 0, 232, textureWidth, textureHeight);
		Seats10.addBox(0F, 0F, 0F, 1, 4, 3);
		Seats10.setRotationPoint(-5F, 16F, 78F);
		Seats10.mirror = true;
		setRotation(Seats10, 0F, 0F, 1.570796F);
		Seats11 = new ModelRendererTurbo(this, 10, 232, textureWidth, textureHeight);
		Seats11.addBox(0F, 0F, 0F, 1, 7, 3);
		Seats11.setRotationPoint(-2F, 16F, 83F);
		Seats11.mirror = true;
		setRotation(Seats11, 0F, 0F, 1.570796F);
		Seats12 = new ModelRendererTurbo(this, 20, 232, textureWidth, textureHeight);
		Seats12.addBox(0F, 0F, 0F, 1, 8, 3);
		Seats12.setRotationPoint(-2F, 13F, 104F);
		Seats12.mirror = true;
		setRotation(Seats12, 0F, 0F, 1.570796F);
		Seats13 = new ModelRendererTurbo(this, 20, 232, textureWidth, textureHeight);
		Seats13.addBox(0F, 0F, 0F, 1, 8, 3);
		Seats13.setRotationPoint(11F, 13F, 104F);
		Seats13.mirror = true;
		setRotation(Seats13, 0F, 0F, 1.570796F);
		Seats14 = new ModelRendererTurbo(this, 30, 232, textureWidth, textureHeight);
		Seats14.addBox(0F, 0F, 0F, 1, 8, 5);
		Seats14.setRotationPoint(-2F, 13.6F, 96F);
		Seats14.mirror = true;
		setRotation(Seats14, 0F, 0F, 1.570796F);
		Seats15 = new ModelRendererTurbo(this, 54, 234, textureWidth, textureHeight);
		Seats15.addBox(0F, 0F, 0F, 1, 8, 3);
		Seats15.setRotationPoint(11F, 13.2F, 98F);
		Seats15.mirror = true;
		setRotation(Seats15, 0F, 0F, 1.570796F);
		Seats16 = new ModelRendererTurbo(this, 44, 232, textureWidth, textureHeight);
		Seats16.addBox(0F, 0F, 0F, 1, 8, 3);
		Seats16.setRotationPoint(-2F, 13F, 90F);
		Seats16.mirror = true;
		setRotation(Seats16, 0F, 0F, 1.570796F);
		Seats17 = new ModelRendererTurbo(this, 70, 236, textureWidth, textureHeight);
		Seats17.addBox(0F, 0F, 0F, 4, 5, 1);
		Seats17.setRotationPoint(-9F, 11F, 78F);
		Seats17.mirror = true;
		setRotation(Seats17, 0F, 0F, 0F);
		Seats18 = new ModelRendererTurbo(this, 70, 244, textureWidth, textureHeight);
		Seats18.addBox(0F, 0F, 0F, 7, 5, 1);
		Seats18.setRotationPoint(-9F, 11F, 85F);
		Seats18.mirror = true;
		setRotation(Seats18, 0F, 0F, 0F);
		Seats19 = new ModelRendererTurbo(this, 90, 244, textureWidth, textureHeight);
		Seats19.addBox(0F, 0F, 0F, 7, 5, 1);
		Seats19.setRotationPoint(-9F, 8F, 90F);
		Seats19.mirror = true;
		setRotation(Seats19, 0F, 0F, 0F);
		Seats20 = new ModelRendererTurbo(this, 90, 244, textureWidth, textureHeight);
		Seats20.addBox(0F, 0F, 0F, 7, 5, 1);
		Seats20.setRotationPoint(3F, 9F, 98F);
		Seats20.mirror = true;
		setRotation(Seats20, 0F, 0F, 0F);
		Seats21 = new ModelRendererTurbo(this, 70, 244, textureWidth, textureHeight);
		Seats21.addBox(0F, 0F, 0F, 7, 5, 1);
		Seats21.setRotationPoint(3F, 8F, 106F);
		Seats21.mirror = true;
		setRotation(Seats21, 0F, 0F, 0F);
		Seats22 = new ModelRendererTurbo(this, 70, 244, textureWidth, textureHeight);
		Seats22.addBox(0F, 0F, 0F, 7, 5, 1);
		Seats22.setRotationPoint(-9F, 8F, 106F);
		Seats22.mirror = true;
		setRotation(Seats22, 0F, 0F, 0F);
		Seats23 = new ModelRendererTurbo(this, 90, 236, textureWidth, textureHeight);
		Seats23.addBox(0F, 0F, 0F, 7, 5, 1);
		Seats23.setRotationPoint(-9F, 9F, 98F);
		Seats23.mirror = true;
		setRotation(Seats23, 0F, 0F, 0F);

		bodyModel=new ModelRendererTurbo[]{Left1,Left2,Left3,Left4,Floor1,Floor2,Floor3,Ceiling,Right1,Right2,Right3,Right4,Wheels1,Wheels2,Bottom,TranConnector1,TranConnector2,TranConnector3,
		TranConnector4,TrainConnector5,TrainConnector6,TrainConnector7,TrainConnector8,TrainConnector9,TrainConnector10,TranConnector11,TranConnector12,TrainConnector13,TrainConnector14,
		TranConnector15,TranConnector16,Stairs1,Stairs2,Stairs3,Walls1,Walls2,Walls3,Walls4,Walls5,Walls6,Walls7,Walls8,Walls9,Seats1,Seats2,Seats3,Seats4,Seats5,Seats6,Seats7,Seats8,Seats9,
				Seats10,Seats11,Seats12,Seats13,Seats14,Seats15,Seats16,Seats17,Seats18,Seats19,Seats20,Seats21,Seats22,Seats23
		};
		fixRotation(bodyModel);

	}

	private void setRotation(ModelRendererTurbo model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}
