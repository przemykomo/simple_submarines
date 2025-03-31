package xyz.przemyk.simplesubs.client;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.entity.state.EntityRenderState;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
public class SubmarineModel extends EntityModel<EntityRenderState> {
	private final ModelPart Hull;
	private final ModelPart Final;
	private final ModelPart InsideView;
	private final ModelPart PropClockwise;
	private final ModelPart PropCounterClockwise;

	public SubmarineModel(ModelPart root) {
        super(root);
		this.Hull = root.getChild("Hull");
		this.Final = this.Hull.getChild("Final");
		this.InsideView = this.Hull.getChild("InsideView");
		this.PropClockwise = root.getChild("PropClockwise");
		this.PropCounterClockwise = root.getChild("PropCounterClockwise");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Hull = partdefinition.addOrReplaceChild("Hull", CubeListBuilder.create().texOffs(348, 170).addBox(-60.0F, -33.0F, 79.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
			.texOffs(119, 350).addBox(-57.25F, -21.0F, 123.9584F, 18.0F, 38.0F, 0.0F, new CubeDeformation(0.0F))
			.texOffs(215, 0).addBox(-74.25F, 13.0F, 75.925F, 34.0F, 0.0F, 61.0F, new CubeDeformation(0.0F))
			.texOffs(58, 622).addBox(-57.25F, -10.0F, 74.0416F, 17.0F, 23.0F, 20.0F, new CubeDeformation(0.0F))
			.texOffs(132, 630).addBox(-57.25F, -10.0F, 112.0416F, 17.0F, 23.0F, 12.0F, new CubeDeformation(0.0F))
			.texOffs(215, 143).addBox(-81.25F, -5.0F, 52.0F, 48.0F, 6.0F, 14.0F, new CubeDeformation(0.0F))
			.texOffs(378, 103).addBox(-81.25F, -5.0F, 148.0F, 48.0F, 6.0F, 14.0F, new CubeDeformation(0.0F))
			.texOffs(266, 164).addBox(-63.0F, -28.0F, 79.0F, 22.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
			.texOffs(215, 164).addBox(-63.0F, -28.0F, 121.0F, 22.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
			.texOffs(477, 124).addBox(-63.0F, -28.0F, 82.0F, 3.0F, 9.0F, 39.0F, new CubeDeformation(0.0F))
			.texOffs(468, 451).addBox(-44.0F, -28.0F, 82.0F, 3.0F, 9.0F, 39.0F, new CubeDeformation(0.0F))
			.texOffs(163, 341).addBox(-63.0F, -37.0F, 79.0F, 22.0F, 2.0F, 45.0F, new CubeDeformation(0.0F))
			.texOffs(378, 124).addBox(-59.0F, -39.0F, 106.0F, 14.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
			.texOffs(256, 393).addBox(-61.25F, -24.725F, 147.225F, 8.0F, 7.0F, 51.0F, new CubeDeformation(0.01F))
			.texOffs(0, 350).addBox(-61.25F, 14.275F, 147.245F, 8.0F, 7.0F, 51.0F, new CubeDeformation(0.01F))
			.texOffs(344, 452).addBox(-61.25F, -24.725F, 198.245F, 8.0F, 46.0F, 3.0F, new CubeDeformation(0.01F))
			.texOffs(358, 143).addBox(-78.25F, 10.0F, 147.245F, 8.0F, 7.0F, 51.0F, new CubeDeformation(0.01F))
			.texOffs(375, 393).addBox(-78.25F, -5.0F, 147.245F, 8.0F, 6.0F, 51.0F, new CubeDeformation(0.01F))
			.texOffs(406, 0).addBox(-44.25F, -5.0F, 147.245F, 8.0F, 6.0F, 51.0F, new CubeDeformation(0.01F))
			.texOffs(358, 202).addBox(-44.25F, 10.0F, 147.245F, 8.0F, 7.0F, 51.0F, new CubeDeformation(0.01F))
			.texOffs(74, 582).addBox(-65.25F, -18.4113F, 172.225F, 16.0F, 33.0F, 0.0F, new CubeDeformation(0.0F))
			.texOffs(590, 94).addBox(-59.25F, 8.9319F, 167.225F, 4.0F, 2.0F, 16.0F, new CubeDeformation(0.01F))
			.texOffs(591, 338).addBox(-59.25F, 1.275F, 167.225F, 4.0F, 2.0F, 16.0F, new CubeDeformation(0.01F))
			.texOffs(184, 595).addBox(-59.25F, -14.725F, 167.225F, 4.0F, 2.0F, 16.0F, new CubeDeformation(0.01F))
			.texOffs(593, 259).addBox(-59.25F, -7.0682F, 167.225F, 4.0F, 2.0F, 16.0F, new CubeDeformation(0.01F))
			.texOffs(515, 95).addBox(-63.0F, -35.0F, 79.0F, 22.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
			.texOffs(358, 261).addBox(-63.0F, -35.0F, 121.0F, 22.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
			.texOffs(494, 390).addBox(-63.0F, -35.0F, 82.0F, 3.0F, 2.0F, 39.0F, new CubeDeformation(0.0F))
			.texOffs(95, 484).addBox(-44.0F, -35.0F, 82.0F, 3.0F, 2.0F, 39.0F, new CubeDeformation(0.0F))
			.texOffs(548, 597).addBox(-63.0F, -33.0F, 94.0F, 3.0F, 5.0F, 14.0F, new CubeDeformation(0.0F))
			.texOffs(338, 595).addBox(-44.0F, -33.0F, 94.0F, 3.0F, 5.0F, 14.0F, new CubeDeformation(0.0F))
			.texOffs(95, 471).addBox(-63.0F, -33.0F, 79.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
			.texOffs(95, 461).addBox(-44.0F, -33.0F, 79.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
			.texOffs(515, 86).addBox(-63.0F, -33.0F, 121.0F, 22.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
			.texOffs(86, 518).addBox(-44.0F, -33.0F, 120.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
			.texOffs(562, 166).addBox(-63.0F, -33.0F, 120.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
			.texOffs(458, 539).addBox(-45.0F, -33.0F, 79.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(57.25F, -11.0F, -106.0F));

		PartDefinition cube_r1 = Hull.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(340, 151).addBox(2.5F, -3.5F, -1.25F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
			.texOffs(230, 177).addBox(-2.5F, 2.5F, -1.25F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
			.texOffs(215, 177).addBox(-3.5F, -3.5F, -1.25F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
			.texOffs(340, 143).addBox(-3.5F, -2.5F, -1.25F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
			.texOffs(579, 408).addBox(-3.5F, -3.5F, -0.25F, 7.0F, 7.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-64.5F, 20.5F, 54.25F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Hull.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(389, 591).addBox(6.5F, -9.6568F, -11.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-62.0784F, -18.3966F, 178.225F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = Hull.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(587, 575).addBox(-6.3033F, 12.9602F, -11.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-61.3613F, -20.0937F, 178.235F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r4 = Hull.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(256, 588).addBox(2.3033F, 12.9602F, -11.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-53.1387F, -20.0937F, 178.235F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r5 = Hull.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(587, 594).addBox(-10.5F, -9.6568F, -11.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-52.4216F, -18.3966F, 178.225F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r6 = Hull.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(297, 588).addBox(2.3033F, -14.9602F, -11.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-53.1387F, 0.3005F, 178.235F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r7 = Hull.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(590, 56).addBox(-6.3033F, -14.9602F, -11.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-61.3613F, 0.3005F, 178.235F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r8 = Hull.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(591, 295).addBox(6.5F, -9.6568F, -11.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-62.0784F, -2.3966F, 178.225F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r9 = Hull.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(438, 586).addBox(2.3033F, -14.9602F, -11.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-53.1387F, 16.3005F, 178.235F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r10 = Hull.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(587, 556).addBox(-6.3033F, -14.9602F, -11.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-61.3613F, 16.3005F, 178.235F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r11 = Hull.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 585).addBox(-6.3033F, 12.9602F, -11.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-61.3613F, -4.0937F, 178.235F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r12 = Hull.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(590, 75).addBox(-10.5F, -9.6568F, -11.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-52.4216F, -2.3966F, 178.225F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r13 = Hull.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(435, 124).addBox(2.3033F, 12.9602F, -11.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-53.1387F, -4.0937F, 178.235F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r14 = Hull.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(562, 124).addBox(-9.3033F, 12.9602F, -12.0F, 8.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-57.25F, -0.5682F, 178.225F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r15 = Hull.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(503, 103).addBox(-13.5F, -9.6568F, -12.0F, 25.0F, 2.0F, 18.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-57.25F, -0.5682F, 178.225F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r16 = Hull.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(562, 145).addBox(-9.3033F, -14.9601F, -12.0F, 8.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-57.25F, -2.5682F, 178.225F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r17 = Hull.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(553, 467).addBox(1.3033F, 12.9602F, -12.0F, 8.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-57.25F, -0.5682F, 178.225F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r18 = Hull.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(538, 295).addBox(1.3033F, -14.9601F, -12.0F, 8.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-57.25F, -2.5682F, 178.225F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r19 = Hull.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(107, 582).addBox(-3.0F, -15.5F, -3.0F, 6.0F, 19.0F, 6.0F, new CubeDeformation(-0.17F)), PartPose.offsetAndRotation(-40.25F, 10.5F, 198.245F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r20 = Hull.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(107, 582).mirror().addBox(-3.0F, -15.5F, -3.0F, 6.0F, 19.0F, 6.0F, new CubeDeformation(-0.17F)).mirror(false), PartPose.offsetAndRotation(-74.25F, 10.5F, 198.245F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r21 = Hull.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(41, 582).addBox(-4.0F, -3.0F, 0.0F, 4.0F, 22.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-36.25F, -2.0F, 198.245F, 0.0F, -0.1614F, 0.0F));

		PartDefinition cube_r22 = Hull.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(579, 373).addBox(0.0F, -3.0F, 0.0F, 4.0F, 22.0F, 12.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-44.25F, -2.0F, 198.245F, 0.0F, 0.1614F, 0.0F));

		PartDefinition cube_r23 = Hull.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(576, 166).addBox(-4.0F, -3.0F, 0.0F, 4.0F, 22.0F, 12.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-70.25F, -2.0F, 198.245F, 0.0F, -0.1614F, 0.0F));

		PartDefinition cube_r24 = Hull.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(576, 201).addBox(0.0F, -3.0F, 0.0F, 4.0F, 22.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-78.25F, -2.0F, 198.245F, 0.0F, 0.1614F, 0.0F));

		PartDefinition cube_r25 = Hull.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(231, 571).addBox(-3.0F, -28.5F, -3.0F, 6.0F, 32.0F, 6.0F, new CubeDeformation(-0.17F)), PartPose.offsetAndRotation(-57.25F, 10.775F, 198.245F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r26 = Hull.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(425, 512).addBox(0.0F, -23.0F, 0.0F, 4.0F, 46.0F, 12.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-61.25F, -1.725F, 201.245F, 0.0F, 0.1614F, 0.0F));

		PartDefinition cube_r27 = Hull.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(311, 452).addBox(-4.0F, -23.0F, 0.0F, 4.0F, 46.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-53.25F, -1.725F, 201.245F, 0.0F, -0.1614F, 0.0F));

		PartDefinition cube_r28 = Hull.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(437, 317).addBox(-11.5F, -9.6568F, -12.0F, 25.0F, 2.0F, 18.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-57.25F, -0.5682F, 178.225F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r29 = Hull.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(429, 341).addBox(-8.0F, 0.0F, 35.0F, 8.0F, 3.0F, 45.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-33.25F, -20.0F, 44.0F, 0.0F, 0.0F, 0.2854F));

		PartDefinition cube_r30 = Hull.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(494, 586).addBox(-3.5F, -5.5F, 9.5F, 0.0F, 22.0F, 4.0F, new CubeDeformation(0.0F))
			.texOffs(373, 595).addBox(44.3733F, -5.5F, 9.5F, 0.0F, 22.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-77.6992F, -5.8383F, 141.4247F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r31 = Hull.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(303, 545).addBox(3.5F, -16.5F, -6.5F, 0.0F, 22.0F, 20.0F, new CubeDeformation(0.01F))
			.texOffs(262, 545).addBox(-44.3483F, -16.5F, -6.5F, 0.0F, 22.0F, 20.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-36.8259F, 2.8383F, 141.4247F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r32 = Hull.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(348, 143).addBox(3.5F, -5.5F, -13.5F, 0.0F, 22.0F, 4.0F, new CubeDeformation(0.0F))
			.texOffs(458, 512).addBox(-44.4233F, -5.5F, -13.5F, 0.0F, 22.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-36.8008F, -5.8383F, 72.5753F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r33 = Hull.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(300, 269).addBox(-17.0F, -3.5F, -17.0F, 34.0F, 37.0F, 34.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-57.25F, -16.5F, 66.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r34 = Hull.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(207, 536).addBox(-27.0F, -11.0F, 0.0F, 27.0F, 34.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-59.625F, -20.9077F, 46.11F, -0.8452F, 0.4637F, -0.467F));

		PartDefinition cube_r35 = Hull.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(152, 536).addBox(0.0F, -11.0F, 0.0F, 27.0F, 34.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-54.9F, -20.9077F, 46.11F, -0.8452F, -0.4637F, 0.467F));

		PartDefinition cube_r36 = Hull.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(477, 235).addBox(-24.0F, 0.0F, -24.0F, 24.0F, 0.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-57.261F, -26.9376F, 66.0F, 0.2938F, 0.0848F, -0.2728F));

		PartDefinition cube_r37 = Hull.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(180, 511).addBox(0.0F, 0.0F, -24.0F, 24.0F, 0.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-57.239F, -26.9376F, 66.0F, 0.2938F, -0.0848F, 0.2728F));

		PartDefinition cube_r38 = Hull.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(409, 540).addBox(-2.0F, 23.0F, 2.0F, 4.0F, 21.0F, 3.0F, new CubeDeformation(0.35F)), PartPose.offsetAndRotation(-57.25F, -37.45F, 58.775F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r39 = Hull.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(507, 556).addBox(3.5F, -16.5F, -13.5F, 0.0F, 22.0F, 20.0F, new CubeDeformation(0.01F))
			.texOffs(0, 542).addBox(-44.3983F, -16.5F, -13.5F, 0.0F, 22.0F, 20.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-36.8008F, 2.8383F, 72.5753F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r40 = Hull.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(479, 586).addBox(-2.0F, -44.0F, 2.0F, 4.0F, 21.0F, 3.0F, new CubeDeformation(0.35F)), PartPose.offsetAndRotation(-57.25F, 34.45F, 58.775F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r41 = Hull.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(378, 62).addBox(-17.0F, -3.5F, -17.0F, 34.0F, 6.0F, 34.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-57.25F, -1.5F, 52.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r42 = Hull.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(163, 269).addBox(-17.0F, -3.5F, -17.0F, 34.0F, 37.0F, 34.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-57.25F, -16.5F, 148.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r43 = Hull.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(119, 389).addBox(-17.0F, -3.5F, -17.0F, 34.0F, 6.0F, 34.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-57.25F, -1.5F, 162.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r44 = Hull.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(525, 0).addBox(0.0F, 0.0F, -12.0F, 13.0F, 3.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-41.6936F, -5.0F, 170.4853F, -0.1084F, -0.7795F, 0.1537F));

		PartDefinition cube_r45 = Hull.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(525, 28).addBox(0.0F, -3.0F, -12.0F, 13.0F, 3.0F, 24.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-41.6936F, 1.0F, 170.4853F, 0.1084F, -0.7795F, -0.1537F));

		PartDefinition cube_r46 = Hull.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(515, 58).addBox(-13.0F, -3.0F, -12.0F, 13.0F, 3.0F, 24.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-72.8063F, 1.0F, 170.4853F, 0.1084F, 0.7795F, 0.1537F));

		PartDefinition cube_r47 = Hull.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(350, 512).addBox(-13.0F, 0.0F, -12.0F, 13.0F, 3.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-72.8063F, -5.0F, 170.4853F, -0.1084F, 0.7795F, -0.1537F));

		PartDefinition cube_r48 = Hull.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 0).addBox(-25.0F, -7.0F, 41.0F, 25.0F, 7.0F, 82.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-33.25F, 17.0F, 25.0F, 0.0F, 0.0F, -0.2854F));

		PartDefinition cube_r49 = Hull.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 90).addBox(0.0F, -7.0F, 41.0F, 25.0F, 7.0F, 82.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-81.25F, 17.0F, 25.0F, 0.0F, 0.0F, 0.2854F));

		PartDefinition cube_r50 = Hull.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 269).addBox(-6.0F, -5.5F, -34.0F, 12.0F, 11.0F, 69.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-38.25F, 24.2F, 107.0F, 0.0F, 0.0F, -0.2854F));

		PartDefinition cube_r51 = Hull.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(215, 62).addBox(-6.0F, -5.5F, -34.0F, 12.0F, 11.0F, 69.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-76.25F, 24.2F, 107.0F, 0.0F, 0.0F, 0.2854F));

		PartDefinition Final = Hull.addOrReplaceChild("Final", CubeListBuilder.create(), PartPose.offset(-59.25F, -20.9077F, 167.89F));

		PartDefinition cube_r52 = Final.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(536, 338).addBox(-27.0F, -23.0F, 0.0F, 27.0F, 34.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.375F, 38.8153F, -121.78F, 0.8452F, 0.4637F, 0.467F));

		PartDefinition cube_r53 = Final.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(538, 260).addBox(0.0F, -23.0F, 0.0F, 27.0F, 34.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.35F, 38.8153F, -121.78F, 0.8452F, -0.4637F, -0.467F));

		PartDefinition cube_r54 = Final.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(458, 551).addBox(-27.0F, -11.0F, 0.0F, 24.0F, 34.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.375F, 0.0F, 0.0F, 0.8452F, -0.4637F, -0.467F));

		PartDefinition cube_r55 = Final.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(41, 547).addBox(3.0F, -11.0F, 0.0F, 24.0F, 34.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.35F, 0.0F, 0.0F, 0.8452F, 0.4637F, 0.467F));

		PartDefinition cube_r56 = Final.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(90, 547).addBox(3.0F, -23.0F, 0.0F, 24.0F, 34.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.35F, 38.8153F, 0.0F, -0.8452F, 0.4637F, -0.467F));

		PartDefinition cube_r57 = Final.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(553, 432).addBox(-27.0F, -23.0F, 0.0F, 24.0F, 34.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.375F, 38.8153F, 0.0F, -0.8452F, -0.4637F, 0.467F));

		PartDefinition InsideView = Hull.addOrReplaceChild("InsideView", CubeListBuilder.create().texOffs(0, 180).addBox(-24.0F, -33.0F, -10.0F, 7.0F, 6.0F, 82.0F, new CubeDeformation(0.0F))
			.texOffs(375, 451).addBox(-24.0F, -17.0F, 33.0F, 7.0F, 21.0F, 39.0F, new CubeDeformation(0.0F))
			.texOffs(437, 261).addBox(-24.0F, -8.0F, -10.0F, 7.0F, 12.0F, 43.0F, new CubeDeformation(0.0F))
			.texOffs(180, 484).addBox(-24.0F, -21.0F, -10.0F, 7.0F, 13.0F, 12.0F, new CubeDeformation(0.0F))
			.texOffs(574, 236).addBox(-24.0F, -17.0F, 11.0F, 7.0F, 9.0F, 13.0F, new CubeDeformation(0.0F))
			.texOffs(0, 461).addBox(-24.0F, -21.0F, 2.0F, 7.0F, 4.0F, 40.0F, new CubeDeformation(0.0F))
			.texOffs(75, 518).addBox(-24.0F, -27.0F, 39.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
			.texOffs(420, 261).addBox(-24.0F, -27.0F, 26.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
			.texOffs(113, 430).addBox(-22.0F, -27.0F, 3.0F, 5.0F, 4.0F, 49.0F, new CubeDeformation(0.0F))
			.texOffs(409, 261).addBox(-24.0F, -27.0F, 13.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
			.texOffs(0, 409).addBox(-24.0F, -23.0F, 3.0F, 7.0F, 2.0F, 49.0F, new CubeDeformation(0.0F))
			.texOffs(541, 500).addBox(-22.0F, -21.0F, 42.0F, 5.0F, 4.0F, 23.0F, new CubeDeformation(0.0F))
			.texOffs(75, 506).addBox(-24.0F, -21.0F, 65.0F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
			.texOffs(262, 536).addBox(-24.0F, -21.0F, 52.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
			.texOffs(222, 430).addBox(-24.0F, -27.0F, -10.0F, 2.0F, 6.0F, 13.0F, new CubeDeformation(0.0F))
			.texOffs(0, 626).addBox(-24.0F, -27.0F, 52.0F, 7.0F, 6.0F, 20.0F, new CubeDeformation(0.0F))
			.texOffs(132, 598).addBox(22.0F, -27.0F, -10.0F, 2.0F, 6.0F, 13.0F, new CubeDeformation(0.0F))
			.texOffs(389, 571).addBox(17.0F, -23.0F, 35.0F, 7.0F, 2.0F, 17.0F, new CubeDeformation(0.0F))
			.texOffs(590, 113).addBox(17.0F, -27.0F, 13.0F, 7.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
			.texOffs(582, 488).addBox(17.0F, -27.0F, 35.0F, 7.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
			.texOffs(139, 571).addBox(22.0F, -27.0F, 52.0F, 2.0F, 6.0F, 20.0F, new CubeDeformation(0.0F))
			.texOffs(438, 571).addBox(22.0F, -21.0F, 65.0F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
			.texOffs(222, 452).addBox(17.0F, -17.0F, 35.0F, 7.0F, 21.0F, 37.0F, new CubeDeformation(0.0F))
			.texOffs(553, 488).addBox(17.0F, -21.0F, 35.0F, 7.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
			.texOffs(541, 528).addBox(17.0F, -21.0F, 42.0F, 5.0F, 4.0F, 23.0F, new CubeDeformation(0.0F))
			.texOffs(317, 164).addBox(17.0F, -27.0F, 3.0F, 5.0F, 4.0F, 10.0F, new CubeDeformation(0.0F))
			.texOffs(536, 373).addBox(17.0F, -27.0F, 42.0F, 5.0F, 4.0F, 10.0F, new CubeDeformation(0.0F))
			.texOffs(541, 442).addBox(22.0F, -21.0F, 52.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
			.texOffs(179, 180).addBox(17.0F, -33.0F, -10.0F, 7.0F, 6.0F, 82.0F, new CubeDeformation(0.0F))
			.texOffs(184, 571).addBox(17.0F, -3.0F, 19.0F, 7.0F, 7.0F, 16.0F, new CubeDeformation(0.0F))
			.texOffs(548, 556).addBox(19.0F, -27.0F, 19.0F, 3.0F, 24.0F, 16.0F, new CubeDeformation(0.0F))
			.texOffs(468, 500).addBox(17.0F, -17.0F, -10.0F, 7.0F, 21.0F, 29.0F, new CubeDeformation(0.0F))
			.texOffs(277, 511).addBox(17.0F, -21.0F, -10.0F, 7.0F, 4.0F, 29.0F, new CubeDeformation(0.0F))
			.texOffs(494, 432).addBox(17.0F, -23.0F, 3.0F, 7.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(-57.25F, 13.0F, 76.0F));

		PartDefinition cube_r58 = InsideView.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(298, 341).addBox(0.0F, 0.0F, 35.0F, 20.0F, 6.0F, 45.0F, new CubeDeformation(0.01F))
			.texOffs(75, 526).addBox(0.0F, 0.0F, 22.0F, 25.0F, 7.0F, 13.0F, new CubeDeformation(0.02F))
			.texOffs(477, 173).addBox(0.0F, 0.0F, 80.0F, 25.0F, 6.0F, 24.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-24.0F, -33.0F, -32.0F, 0.0F, 0.0F, -0.2854F));

		PartDefinition cube_r59 = InsideView.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(524, 317).addBox(-25.0F, 0.0F, -123.0F, 25.0F, 7.0F, 13.0F, new CubeDeformation(0.01F))
			.texOffs(477, 204).addBox(-25.0F, 0.0F, -65.0F, 25.0F, 6.0F, 24.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(24.0F, -33.0F, 113.0F, 0.0F, 0.0F, 0.2854F));

		PartDefinition PropClockwise = partdefinition.addOrReplaceChild("PropClockwise", CubeListBuilder.create().texOffs(982, 960).addBox(-1.5F, 1.6319F, -4.345F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.01F))
			.texOffs(960, 975).addBox(-1.5F, -3.6391F, -4.345F, 3.0F, 6.0F, 8.0F, new CubeDeformation(-0.015F)), PartPose.offset(0.0F, -20.9F, 81.57F));

		PartDefinition cube_r60 = PropClockwise.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(960, 1009).addBox(-1.0173F, 2.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6545F, -2.3562F));

		PartDefinition cube_r61 = PropClockwise.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(1004, 987).addBox(0.0173F, -7.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6545F, 2.3562F));

		PartDefinition cube_r62 = PropClockwise.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(1004, 978).addBox(-1.0173F, 2.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6545F, 2.3562F));

		PartDefinition cube_r63 = PropClockwise.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(1004, 969).addBox(0.0173F, -7.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6545F, -2.3562F));

		PartDefinition cube_r64 = PropClockwise.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(1004, 960).addBox(-1.0173F, 2.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6545F, 3.1416F));

		PartDefinition cube_r65 = PropClockwise.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(1002, 1000).addBox(0.0173F, -7.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6545F, 3.1416F));

		PartDefinition cube_r66 = PropClockwise.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(992, 1000).addBox(0.0173F, -7.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6545F, 1.5708F));

		PartDefinition cube_r67 = PropClockwise.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(982, 1000).addBox(-1.0173F, 2.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6545F, 1.5708F));

		PartDefinition cube_r68 = PropClockwise.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(960, 999).addBox(-1.5026F, -3.638F, -4.345F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
			.texOffs(982, 980).addBox(-1.5026F, 1.6329F, -4.345F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r69 = PropClockwise.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(982, 990).addBox(-1.4974F, -3.638F, -4.345F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
			.texOffs(982, 970).addBox(-1.4974F, 1.6329F, -4.345F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r70 = PropClockwise.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(960, 960).addBox(-1.4964F, -3.3645F, -4.345F, 3.0F, 7.0F, 8.0F, new CubeDeformation(-0.01F))
			.texOffs(960, 989).addBox(-1.4964F, -3.6355F, -4.345F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition PropCounterClockwise = partdefinition.addOrReplaceChild("PropCounterClockwise", CubeListBuilder.create().texOffs(960, 975).mirror().addBox(-1.5F, -3.5391F, -4.775F, 3.0F, 6.0F, 8.0F, new CubeDeformation(-0.015F)).mirror(false)
			.texOffs(982, 960).mirror().addBox(-1.5F, 1.7319F, -4.775F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offset(0.0F, -5.0F, 82.0F));

		PartDefinition cube_r71 = PropCounterClockwise.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(982, 970).mirror().addBox(-1.5026F, 1.6329F, -4.345F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
			.texOffs(982, 990).mirror().addBox(-1.5026F, -3.638F, -4.345F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1F, -0.43F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r72 = PropCounterClockwise.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(982, 980).mirror().addBox(-1.4974F, 1.6329F, -4.345F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
			.texOffs(960, 999).mirror().addBox(-1.4974F, -3.638F, -4.345F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1F, -0.43F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r73 = PropCounterClockwise.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(960, 989).mirror().addBox(-1.5036F, -3.6355F, -4.345F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.01F)).mirror(false)
			.texOffs(960, 960).mirror().addBox(-1.5036F, -3.3645F, -4.345F, 3.0F, 7.0F, 8.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1F, -0.43F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r74 = PropCounterClockwise.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(982, 1000).mirror().addBox(0.0173F, 2.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1F, -0.43F, 0.0F, 0.6545F, -1.5708F));

		PartDefinition cube_r75 = PropCounterClockwise.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(992, 1000).mirror().addBox(-1.0173F, -7.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1F, -0.43F, 0.0F, -0.6545F, -1.5708F));

		PartDefinition cube_r76 = PropCounterClockwise.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(1002, 1000).mirror().addBox(-1.0173F, -7.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1F, -0.43F, 0.0F, -0.6545F, -3.1416F));

		PartDefinition cube_r77 = PropCounterClockwise.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(1004, 960).mirror().addBox(0.0173F, 2.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1F, -0.43F, 0.0F, 0.6545F, -3.1416F));

		PartDefinition cube_r78 = PropCounterClockwise.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(1004, 969).mirror().addBox(-1.0173F, -7.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1F, -0.43F, 0.0F, -0.6545F, 2.3562F));

		PartDefinition cube_r79 = PropCounterClockwise.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(1004, 978).mirror().addBox(0.0173F, 2.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1F, -0.43F, 0.0F, 0.6545F, -2.3562F));

		PartDefinition cube_r80 = PropCounterClockwise.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(1004, 987).mirror().addBox(-1.0173F, -7.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1F, -0.43F, 0.0F, -0.6545F, -2.3562F));

		PartDefinition cube_r81 = PropCounterClockwise.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(960, 1009).mirror().addBox(0.0173F, 2.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1F, -0.43F, 0.0F, 0.6545F, 2.3562F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(EntityRenderState renderState) {
		super.setupAnim(renderState);
		PropClockwise.zRot = renderState.ageInTicks + renderState.partialTick;
		PropCounterClockwise.zRot = -PropClockwise.zRot;
	}
}