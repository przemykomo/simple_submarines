package xyz.przemyk.simplesubs.client;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.entity.state.EntityRenderState;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
public class UBoatModel extends EntityModel<EntityRenderState> {
	private final ModelPart Upgrades;
	private final ModelPart Propeller;
	private final ModelPart Hull;
	private final ModelPart InteriorClear;

	public UBoatModel(ModelPart root) {
        super(root);
		this.Upgrades = root.getChild("Upgrades");
		this.Propeller = this.Upgrades.getChild("Propeller");
		this.Hull = root.getChild("Hull");
		this.InteriorClear = this.Hull.getChild("InteriorClear");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Upgrades = partdefinition.addOrReplaceChild("Upgrades", CubeListBuilder.create(), PartPose.offset(24.0F, 40.5F, -24.0F));

		PartDefinition Propeller = Upgrades.addOrReplaceChild("Propeller", CubeListBuilder.create().texOffs(618, 135).addBox(-2.0F, -4.8426F, -5.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(702, 573).addBox(-1.5F, -5.8426F, -4.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(714, 573).addBox(-1.5F, 3.8574F, -4.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(852, 511).addBox(-2.0F, -4.8426F, -11.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offset(-24.0F, -36.5074F, 244.0F));

		PartDefinition cube_r1 = Propeller.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(154, 809).addBox(-1.3827F, 5.85F, -1.9239F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0074F, -8.5F, 0.0F, -0.3927F, 0.2618F));

		PartDefinition cube_r2 = Propeller.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(360, 829).addBox(-1.5F, 3.85F, -2.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(372, 829).addBox(-1.5F, -5.85F, -2.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0074F, -8.5F, 0.0F, 0.0F, 1.309F));

		PartDefinition cube_r3 = Propeller.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(154, 821).addBox(-1.3827F, 5.85F, -1.9239F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0074F, -8.5F, 0.0F, -0.3927F, 1.309F));

		PartDefinition cube_r4 = Propeller.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(154, 833).addBox(-0.6173F, -12.85F, -1.9239F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0074F, -8.5F, 0.0F, 0.3927F, 1.309F));

		PartDefinition cube_r5 = Propeller.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(384, 829).addBox(-1.5F, 3.85F, -2.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(888, 652).addBox(-1.5F, -5.85F, -2.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0074F, -8.5F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r6 = Propeller.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(154, 845).addBox(-0.6173F, -12.85F, -1.9239F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0074F, -8.5F, 0.0F, 0.3927F, 0.2618F));

		PartDefinition cube_r7 = Propeller.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(900, 652).addBox(-1.5F, 3.85F, -2.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(310, 905).addBox(-1.5F, -5.85F, -2.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(300, 870).addBox(-2.0F, -4.85F, -2.5F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(402, 750).addBox(-2.0F, -4.85F, 3.5F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0074F, -8.5F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r8 = Propeller.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(154, 857).addBox(-1.3827F, 5.85F, -1.9239F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0074F, -8.5F, 0.0F, -0.3927F, -0.7854F));

		PartDefinition cube_r9 = Propeller.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(874, 744).addBox(-0.6173F, -12.85F, -1.9239F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0074F, -8.5F, 0.0F, 0.3927F, -0.7854F));

		PartDefinition cube_r10 = Propeller.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(824, 425).addBox(-2.0F, -4.85F, -2.5F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(422, 750).addBox(-2.0F, -4.85F, 3.5F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0074F, -8.5F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r11 = Propeller.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(836, 257).addBox(-2.0F, -4.85F, -2.5F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.01F))
		.texOffs(442, 750).addBox(-2.0F, -4.85F, 3.5F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0074F, -8.5F, 0.0F, 0.0F, 3.1416F));

		PartDefinition cube_r12 = Propeller.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(720, 836).addBox(-2.0F, -4.85F, -2.5F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(462, 750).addBox(-2.0F, -4.85F, 3.5F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0074F, -8.5F, 0.0F, 0.0F, 2.3562F));

		PartDefinition cube_r13 = Propeller.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(720, 843).addBox(-2.0F, -4.85F, -2.5F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.01F))
		.texOffs(482, 750).addBox(-2.0F, -4.85F, 3.5F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0074F, -8.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r14 = Propeller.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(856, 257).addBox(-2.0F, -4.85F, -2.5F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(598, 135).addBox(-2.0F, -4.85F, 3.5F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0074F, -8.5F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r15 = Propeller.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(872, 511).addBox(-2.0F, -4.85F, -2.5F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.01F))
		.texOffs(274, 678).addBox(-2.0F, -4.85F, 3.5F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0074F, -8.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r16 = Propeller.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(336, 829).addBox(-1.5F, -5.85F, -2.1739F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(348, 829).addBox(-1.5F, 3.85F, -2.1739F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0074F, -2.3261F, 0.0F, 0.0F, -2.0944F));

		PartDefinition cube_r17 = Propeller.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(154, 785).addBox(-1.4492F, -12.85F, -2.0845F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0074F, -2.3261F, 0.0F, -0.3927F, -2.0944F));

		PartDefinition cube_r18 = Propeller.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(154, 797).addBox(-0.5508F, 5.85F, -2.0845F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0074F, -2.3261F, 0.0F, 0.3927F, -2.0944F));

		PartDefinition cube_r19 = Propeller.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(212, 749).addBox(-1.4492F, -12.85F, -2.0845F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0074F, -2.3261F, 0.0F, -0.3927F, -1.0472F));

		PartDefinition cube_r20 = Propeller.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(726, 573).addBox(-1.5F, -5.85F, -2.1739F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(324, 829).addBox(-1.5F, 3.85F, -2.1739F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0074F, -2.3261F, 0.0F, 0.0F, -1.0472F));

		PartDefinition cube_r21 = Propeller.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(212, 761).addBox(-0.5508F, 5.85F, -2.0845F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0074F, -2.3261F, 0.0F, 0.3927F, -1.0472F));

		PartDefinition cube_r22 = Propeller.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(212, 737).addBox(-0.5508F, 5.85F, -2.0845F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0074F, -2.3261F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r23 = Propeller.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(212, 725).addBox(-1.4492F, -12.85F, -2.0845F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0074F, -2.3261F, 0.0F, -0.3927F, 0.0F));

		PartDefinition Hull = partdefinition.addOrReplaceChild("Hull", CubeListBuilder.create().texOffs(984, 0).addBox(-18.985F, 2.5718F, -67.0F, 34.0F, 9.0F, 12.0F, new CubeDeformation(0.01F))
		.texOffs(324, 813).addBox(-12.985F, -11.0782F, -223.0F, 22.0F, 0.0F, 16.0F, new CubeDeformation(0.02F))
		.texOffs(840, 658).addBox(-9.985F, -19.0282F, -223.0F, 16.0F, 9.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(860, 963).addBox(-18.985F, -21.4282F, -98.0F, 34.0F, 33.0F, 12.0F, new CubeDeformation(0.01F))
		.texOffs(740, 658).addBox(-25.985F, -28.4282F, -166.0F, 48.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(972, 127).addBox(-11.985F, -21.4282F, -166.0F, 20.0F, 1.0F, 27.0F, new CubeDeformation(0.0F))
		.texOffs(172, 697).addBox(-23.0272F, -19.4282F, -226.7817F, 0.0F, 18.0F, 20.0F, new CubeDeformation(0.01F))
		.texOffs(750, 759).addBox(-14.9007F, -19.4282F, -281.1578F, 1.0F, 18.0F, 75.0F, new CubeDeformation(0.01F))
		.texOffs(172, 777).addBox(9.9306F, -19.4282F, -281.1578F, 1.0F, 18.0F, 75.0F, new CubeDeformation(0.01F))
		.texOffs(172, 735).addBox(19.0572F, -19.4282F, -226.7817F, 0.0F, 18.0F, 20.0F, new CubeDeformation(0.01F))
		.texOffs(902, 723).addBox(-9.985F, -13.0782F, -205.0F, 16.0F, 25.0F, 38.0F, new CubeDeformation(0.02F))
		.texOffs(324, 834).addBox(-5.985F, -27.4282F, -53.0F, 8.0F, 12.0F, 66.0F, new CubeDeformation(0.01F))
		.texOffs(398, 106).addBox(-27.985F, -3.4282F, 42.0F, 52.0F, 4.0F, 29.0F, new CubeDeformation(0.02F))
		.texOffs(888, 600).addBox(-7.985F, -15.9282F, -23.0F, 12.0F, 6.0F, 46.0F, new CubeDeformation(0.01F))
		.texOffs(902, 838).addBox(-3.985F, -6.2782F, 13.0F, 4.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(686, 573).addBox(-3.985F, -6.2782F, 38.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(1008, 861).addBox(-10.985F, -10.4282F, 13.0F, 18.0F, 18.0F, 0.0F, new CubeDeformation(0.01F))
		.texOffs(398, 0).addBox(-25.985F, -21.4282F, -166.0F, 7.0F, 4.0F, 102.0F, new CubeDeformation(0.0F))
		.texOffs(296, 579).addBox(15.015F, -21.4282F, -166.0F, 7.0F, 4.0F, 102.0F, new CubeDeformation(0.0F))
		.texOffs(964, 163).addBox(-25.985F, -23.0782F, -207.0F, 7.0F, 6.0F, 41.0F, new CubeDeformation(0.0F))
		.texOffs(324, 777).addBox(-18.985F, -22.4282F, -207.0F, 34.0F, 34.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(222, 964).addBox(15.015F, -23.0782F, -207.0F, 7.0F, 6.0F, 41.0F, new CubeDeformation(0.0F))
		.texOffs(342, 142).addBox(15.015F, -13.4282F, -207.0F, 7.0F, 2.0F, 143.0F, new CubeDeformation(0.0F))
		.texOffs(874, 723).addBox(20.015F, -21.4282F, -64.0F, 2.0F, 10.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(892, 1008).addBox(-25.985F, -21.4282F, -64.0F, 2.0F, 10.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(502, 750).addBox(20.015F, -17.4282F, -77.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(876, 257).addBox(20.015F, -17.4282F, -90.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(142, 873).addBox(20.015F, -17.4282F, -103.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(300, 884).addBox(20.015F, -17.4282F, -155.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(142, 880).addBox(20.015F, -17.4282F, -142.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(310, 877).addBox(20.015F, -17.4282F, -129.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(300, 877).addBox(20.015F, -17.4282F, -116.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(886, 257).addBox(20.015F, -17.4282F, -168.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(310, 884).addBox(20.015F, -17.4282F, -181.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(888, 744).addBox(20.015F, -17.4282F, -207.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(142, 887).addBox(20.015F, -17.4282F, -194.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(342, 432).addBox(15.015F, -17.4282F, -207.0F, 5.0F, 4.0F, 143.0F, new CubeDeformation(0.0F))
		.texOffs(300, 905).addBox(-25.985F, -17.4282F, -207.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(902, 511).addBox(-25.985F, -17.4282F, -77.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(142, 901).addBox(-25.985F, -17.4282F, -90.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(310, 898).addBox(-25.985F, -17.4282F, -103.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(300, 898).addBox(-25.985F, -17.4282F, -155.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(896, 257).addBox(-25.985F, -17.4282F, -142.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(142, 894).addBox(-25.985F, -17.4282F, -129.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(892, 511).addBox(-25.985F, -17.4282F, -116.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(310, 891).addBox(-25.985F, -17.4282F, -168.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(300, 891).addBox(-25.985F, -17.4282F, -181.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(342, 287).addBox(-25.985F, -13.4282F, -207.0F, 7.0F, 2.0F, 143.0F, new CubeDeformation(0.0F))
		.texOffs(0, 458).addBox(-23.985F, -17.4282F, -207.0F, 5.0F, 4.0F, 143.0F, new CubeDeformation(0.0F))
		.texOffs(888, 751).addBox(-25.985F, -17.4282F, -194.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(922, 563).addBox(-25.985F, 11.5718F, -207.0F, 48.0F, 7.0F, 19.0F, new CubeDeformation(0.01F))
		.texOffs(952, 1003).addBox(17.015F, -11.4282F, -194.0F, 3.0F, 23.0F, 12.0F, new CubeDeformation(0.01F))
		.texOffs(0, 0).addBox(-33.985F, 11.5718F, -188.0F, 64.0F, 7.0F, 135.0F, new CubeDeformation(0.01F))
		.texOffs(402, 685).addBox(-11.985F, -36.4282F, -188.0F, 2.0F, 11.0F, 54.0F, new CubeDeformation(0.01F))
		.texOffs(874, 658).addBox(6.015F, -36.4282F, -188.0F, 2.0F, 11.0F, 54.0F, new CubeDeformation(0.01F))
		.texOffs(616, 90).addBox(-11.985F, -45.4282F, -174.0F, 2.0F, 9.0F, 5.0F, new CubeDeformation(0.01F))
		.texOffs(274, 664).addBox(-11.985F, -45.4282F, -159.0F, 2.0F, 9.0F, 5.0F, new CubeDeformation(0.01F))
		.texOffs(638, 522).addBox(-11.985F, -47.4282F, -183.0F, 2.0F, 2.0F, 49.0F, new CubeDeformation(0.01F))
		.texOffs(758, 963).addBox(6.015F, -47.4282F, -183.0F, 2.0F, 2.0F, 49.0F, new CubeDeformation(0.01F))
		.texOffs(212, 711).addBox(6.015F, -45.4282F, -174.0F, 2.0F, 9.0F, 5.0F, new CubeDeformation(0.01F))
		.texOffs(212, 697).addBox(6.015F, -45.4282F, -159.0F, 2.0F, 9.0F, 5.0F, new CubeDeformation(0.01F))
		.texOffs(0, 873).addBox(-11.985F, -48.4282F, -185.0F, 20.0F, 1.0F, 51.0F, new CubeDeformation(0.01F))
		.texOffs(296, 574).addBox(-9.985F, -36.4537F, -187.0323F, 16.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F))
		.texOffs(860, 1008).addBox(-9.985F, -48.4282F, -134.0F, 16.0F, 23.0F, 0.0F, new CubeDeformation(0.02F))
		.texOffs(982, 389).addBox(-9.985F, -28.4782F, -134.0F, 16.0F, 0.0F, 29.0F, new CubeDeformation(0.02F)), PartPose.offset(1.985F, 5.4282F, 183.0F));

		PartDefinition cube_r24 = Hull.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(514, 671).addBox(-24.0F, 7.5F, 0.0F, 24.0F, 16.0F, 70.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(22.005F, -4.5612F, -57.0707F, 0.1772F, -0.1719F, -0.0306F));

		PartDefinition cube_r25 = Hull.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(642, 264).addBox(0.0F, -16.0F, 0.0F, 24.0F, 16.0F, 70.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-25.975F, 18.5818F, -52.99F, 0.1772F, 0.1719F, 0.0306F));

		PartDefinition cube_r26 = Hull.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(830, 0).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 18.0F, 70.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-22.5382F, -21.4282F, -53.6078F, -0.1688F, 0.1716F, -0.0175F));

		PartDefinition cube_r27 = Hull.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 785).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 18.0F, 70.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.5682F, -21.4282F, -53.6078F, -0.1688F, -0.1716F, 0.0175F));

		PartDefinition cube_r28 = Hull.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(830, 264).addBox(0.0F, -4.0F, -79.0F, 12.0F, 8.0F, 67.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-28.3091F, -1.4382F, 24.9859F, 0.0F, -0.0305F, 0.0F));

		PartDefinition cube_r29 = Hull.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(824, 350).addBox(-12.0F, -4.0F, -79.0F, 12.0F, 8.0F, 67.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(24.3391F, -1.4382F, 24.9859F, 0.0F, 0.0305F, 0.0F));

		PartDefinition cube_r30 = Hull.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(984, 50).addBox(10.0F, 0.0F, 34.0F, 16.0F, 9.0F, 19.0F, new CubeDeformation(0.02F))
		.texOffs(318, 1003).addBox(10.0F, 0.0F, 0.0F, 16.0F, 28.0F, 3.0F, new CubeDeformation(0.02F))
		.texOffs(852, 425).addBox(8.0F, 0.0F, 0.0F, 2.0F, 28.0F, 58.0F, new CubeDeformation(0.02F))
		.texOffs(740, 600).addBox(10.0F, 28.0F, 0.0F, 16.0F, 0.0F, 58.0F, new CubeDeformation(0.02F))
		.texOffs(600, 836).addBox(26.0F, 0.0F, 0.0F, 2.0F, 28.0F, 58.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-19.985F, -48.4282F, -134.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r31 = Hull.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(226, 664).addBox(-10.0F, 24.0F, 0.0F, 20.0F, 16.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(740, 836).addBox(-10.0F, 12.0F, 0.0F, 2.0F, 12.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(630, 90).addBox(8.0F, 12.0F, 0.0F, 2.0F, 12.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(560, 135).addBox(-8.0F, 12.0F, 0.0F, 16.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.985F, -59.9777F, -181.7427F, -0.2749F, 0.0F, 0.0F));

		PartDefinition cube_r32 = Hull.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(300, 912).addBox(-11.2565F, -11.6246F, -39.0F, 12.0F, 6.0F, 46.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6691F, 4.3209F, 16.0F, 0.0F, 0.0F, 2.3562F));

		PartDefinition cube_r33 = Hull.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(416, 916).addBox(-3.1251F, -9.243F, -39.0F, 12.0F, 6.0F, 46.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6691F, 4.3209F, 16.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r34 = Hull.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(922, 511).addBox(-7.6841F, -8.7497F, -39.0F, 12.0F, 6.0F, 46.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-3.6691F, 4.3209F, 16.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r35 = Hull.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(532, 922).addBox(-11.7497F, 6.8154F, -39.0F, 12.0F, 6.0F, 46.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-3.6691F, 4.3209F, 16.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r36 = Hull.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(720, 911).addBox(-6.0F, -3.0F, -39.0F, 12.0F, 6.0F, 46.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(9.5144F, -1.4288F, 16.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r37 = Hull.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(836, 911).addBox(-4.2322F, -27.3952F, -39.0F, 12.0F, 6.0F, 46.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.3537F, 6.4399F, 16.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r38 = Hull.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(902, 786).addBox(-6.0F, -3.0F, -39.0F, 12.0F, 6.0F, 46.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.1163F, -9.5601F, 16.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r39 = Hull.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(986, 704).addBox(-4.1713F, -4.2066F, -20.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(1008, 879).addBox(-4.1713F, -4.2066F, -45.0F, 4.0F, 1.0F, 13.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.35F, 58.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r40 = Hull.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(638, 573).addBox(-3.0856F, -2.8575F, -20.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(1008, 243).addBox(-3.0856F, -2.8575F, -45.0F, 4.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.35F, 58.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r41 = Hull.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(1004, 615).addBox(-1.364F, -2.6713F, -20.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(996, 335).addBox(-1.364F, -2.6713F, -45.0F, 4.0F, 1.0F, 13.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.35F, 58.0F, 0.0F, 0.0F, 2.3562F));

		PartDefinition cube_r42 = Hull.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(654, 573).addBox(-0.015F, -3.7569F, -20.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(970, 838).addBox(-0.015F, -3.7569F, -45.0F, 4.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.35F, 58.0F, 0.0F, 0.0F, 3.1416F));

		PartDefinition cube_r43 = Hull.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(1004, 633).addBox(-2.0F, -0.5F, -20.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(256, 949).addBox(-2.0F, -0.5F, -45.0F, 4.0F, 1.0F, 13.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-5.0557F, 1.635F, 58.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r44 = Hull.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(390, 1007).addBox(-2.0F, -0.5F, -20.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(222, 949).addBox(-2.0F, -0.5F, -45.0F, 4.0F, 1.0F, 13.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-5.0557F, -4.5063F, 58.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r45 = Hull.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(670, 573).addBox(-2.0F, -0.5F, -20.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(936, 838).addBox(-2.0F, -0.5F, -45.0F, 4.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.3276F, -1.4356F, 58.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r46 = Hull.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(972, 425).addBox(14.0F, -2.4524F, -27.3623F, 12.0F, 4.0F, 35.0F, new CubeDeformation(0.01F))
		.texOffs(982, 350).addBox(-26.0F, -2.4524F, -27.3623F, 12.0F, 4.0F, 35.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.985F, -1.4285F, 40.1792F, -0.0567F, 0.0F, -1.5708F));

		PartDefinition cube_r47 = Hull.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(972, 464).addBox(14.0F, -1.5465F, -27.3428F, 12.0F, 4.0F, 35.0F, new CubeDeformation(0.01F))
		.texOffs(506, 974).addBox(-26.0F, -1.5465F, -27.3428F, 12.0F, 4.0F, 35.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.985F, -1.4285F, 40.1792F, 0.0567F, 0.0F, -1.5708F));

		PartDefinition cube_r48 = Hull.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(648, 922).addBox(-9.0F, -2.0F, -27.0F, 9.0F, 4.0F, 27.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.9848F, -51.4285F, 19.0F, 0.0F, 1.1868F, -1.5708F));

		PartDefinition cube_r49 = Hull.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(964, 210).addBox(14.0F, -1.9997F, -21.1792F, 24.0F, 4.0F, 29.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.985F, -13.4285F, 40.1792F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r50 = Hull.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(830, 339).addBox(-76.0F, -2.0F, 0.0F, 76.0F, 4.0F, 7.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-1.9848F, -51.4285F, 52.0F, 0.0F, -0.0873F, -1.5708F));

		PartDefinition cube_r51 = Hull.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(836, 243).addBox(-76.0F, -2.0F, 3.0F, 76.0F, 4.0F, 10.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.9848F, -51.4285F, 39.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r52 = Hull.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(972, 88).addBox(14.0F, -1.5465F, -27.3428F, 12.0F, 4.0F, 35.0F, new CubeDeformation(0.01F))
		.texOffs(412, 968).addBox(-26.0F, -1.5465F, -27.3428F, 12.0F, 4.0F, 35.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.985F, -1.4285F, 40.1792F, 0.0567F, 0.0F, 0.0F));

		PartDefinition cube_r53 = Hull.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(106, 972).addBox(14.0F, -2.4524F, -27.3623F, 12.0F, 4.0F, 35.0F, new CubeDeformation(0.01F))
		.texOffs(318, 964).addBox(-26.0F, -2.4524F, -27.3623F, 12.0F, 4.0F, 35.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.985F, -1.4285F, 40.1792F, -0.0567F, 0.0F, 0.0F));

		PartDefinition cube_r54 = Hull.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(226, 685).addBox(-4.0F, -12.0F, -80.0F, 8.0F, 12.0F, 80.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.985F, 24.5718F, 12.98F, -0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r55 = Hull.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(642, 90).addBox(-14.0F, 1.5F, -83.0F, 14.0F, 4.0F, 83.0F, new CubeDeformation(0.02F))
		.texOffs(638, 432).addBox(-24.0F, 36.15F, -83.0F, 24.0F, 7.0F, 83.0F, new CubeDeformation(0.01F))
		.texOffs(600, 974).addBox(0.0F, 5.15F, -20.0F, 0.0F, 18.0F, 20.0F, new CubeDeformation(0.01F))
		.texOffs(702, 671).addBox(-11.0F, 23.15F, -75.0F, 11.0F, 13.0F, 75.0F, new CubeDeformation(0.01F))
		.texOffs(576, 759).addBox(-12.0F, 13.15F, -75.0F, 12.0F, 2.0F, 75.0F, new CubeDeformation(0.009F))
		.texOffs(988, 296).addBox(-7.0F, 5.15F, -83.0F, 7.0F, 31.0F, 8.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(22.015F, -24.5782F, -207.0F, 0.0F, 0.1484F, 0.0F));

		PartDefinition cube_r56 = Hull.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(642, 177).addBox(0.0F, 1.5F, -83.0F, 14.0F, 4.0F, 83.0F, new CubeDeformation(0.0F))
		.texOffs(988, 257).addBox(0.0F, 5.15F, -83.0F, 7.0F, 31.0F, 8.0F, new CubeDeformation(0.01F))
		.texOffs(296, 536).addBox(0.0F, 5.15F, -20.0F, 0.0F, 18.0F, 20.0F, new CubeDeformation(0.01F))
		.texOffs(0, 697).addBox(0.0F, 23.15F, -75.0F, 11.0F, 13.0F, 75.0F, new CubeDeformation(0.01F))
		.texOffs(402, 757).addBox(0.0F, 13.15F, -75.0F, 12.0F, 2.0F, 75.0F, new CubeDeformation(0.009F))
		.texOffs(616, 0).addBox(0.0F, 36.15F, -83.0F, 24.0F, 7.0F, 83.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-25.985F, -24.5782F, -207.0F, 0.0F, -0.1484F, 0.0F));

		PartDefinition cube_r57 = Hull.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(226, 605).addBox(-8.5F, -38.5F, -8.5F, 17.0F, 42.0F, 17.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.985F, 15.2218F, -289.125F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r58 = Hull.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(1004, 589).addBox(-8.0F, -4.5F, 0.0F, 0.0F, 9.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0729F, -14.5282F, -221.8165F, 0.0F, -0.1484F, 0.0F));

		PartDefinition cube_r59 = Hull.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(982, 1003).addBox(8.0F, -4.5F, 0.0F, 0.0F, 9.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8971F, -14.5282F, -221.8165F, 0.0F, 0.1484F, 0.0F));

		PartDefinition InteriorClear = Hull.addOrReplaceChild("InteriorClear", CubeListBuilder.create().texOffs(0, 142).addBox(-8.0F, 40.0F, 31.0F, 20.0F, 7.0F, 151.0F, new CubeDeformation(0.01F))
		.texOffs(836, 88).addBox(0.0F, 19.0F, -14.0F, 7.0F, 14.0F, 61.0F, new CubeDeformation(0.0F))
		.texOffs(466, 1007).addBox(41.0F, 19.0F, 104.0F, 7.0F, 14.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(356, 1003).addBox(0.0F, 10.0F, -24.0F, 7.0F, 23.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(296, 458).addBox(41.0F, 10.0F, 113.0F, 7.0F, 23.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(836, 163).addBox(41.0F, 10.0F, 47.0F, 7.0F, 23.0F, 57.0F, new CubeDeformation(0.0F))
		.texOffs(472, 836).addBox(0.0F, 10.0F, 47.0F, 7.0F, 23.0F, 57.0F, new CubeDeformation(0.0F))
		.texOffs(296, 497).addBox(0.0F, 10.0F, 113.0F, 7.0F, 23.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(1008, 838).addBox(0.0F, 19.0F, 104.0F, 7.0F, 14.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(986, 678).addBox(0.0F, 10.0F, -5.0F, 7.0F, 9.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(986, 652).addBox(0.0F, 10.0F, 21.0F, 7.0F, 9.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(0, 300).addBox(36.0F, 40.0F, 31.0F, 20.0F, 7.0F, 151.0F, new CubeDeformation(0.01F))
		.texOffs(0, 925).addBox(41.0F, 19.0F, 1.0F, 7.0F, 14.0F, 46.0F, new CubeDeformation(0.0F))
		.texOffs(40, 985).addBox(41.0F, 10.0F, 21.0F, 7.0F, 9.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(430, 1007).addBox(41.0F, 10.0F, 1.0F, 7.0F, 9.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(0, 985).addBox(41.0F, 10.0F, -24.0F, 7.0F, 23.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(222, 927).addBox(14.0F, -1.65F, -24.0F, 20.0F, 4.0F, 18.0F, new CubeDeformation(0.02F))
		.texOffs(154, 870).addBox(14.0F, -1.6F, -93.0F, 20.0F, 4.0F, 53.0F, new CubeDeformation(0.02F)), PartPose.offset(-25.985F, -21.4282F, -183.0F));

		PartDefinition cube_r60 = InteriorClear.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(952, 956).addBox(10.0F, 0.0F, -41.0F, 14.0F, 6.0F, 41.0F, new CubeDeformation(-0.01F))
		.texOffs(648, 963).addBox(44.0F, 0.0F, -41.0F, 14.0F, 6.0F, 41.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-10.0F, -7.0F, 17.0F, 0.1265F, 0.0F, 0.0F));

		PartDefinition cube_r61 = InteriorClear.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(642, 350).addBox(0.0F, 0.0F, 0.0F, 21.0F, 8.0F, 70.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 130.0F, -0.2109F, 0.1197F, -0.3098F));

		PartDefinition cube_r62 = InteriorClear.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(740, 522).addBox(-21.0F, 0.0F, 0.0F, 21.0F, 8.0F, 70.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(48.0F, 0.0F, 130.0F, -0.2109F, -0.1197F, 0.3098F));

		PartDefinition cube_r63 = InteriorClear.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(984, 21).addBox(0.0F, 0.0F, 17.0F, 16.0F, 4.0F, 25.0F, new CubeDeformation(0.01F))
		.texOffs(0, 605).addBox(0.0F, 0.0F, 42.0F, 25.0F, 4.0F, 88.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2854F));

		PartDefinition cube_r64 = InteriorClear.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(514, 579).addBox(-25.0F, 0.0F, 42.0F, 25.0F, 4.0F, 88.0F, new CubeDeformation(0.01F))
		.texOffs(560, 106).addBox(-16.0F, 0.0F, 17.0F, 16.0F, 4.0F, 25.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(48.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2854F));

		PartDefinition cube_r65 = InteriorClear.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(864, 852).addBox(12.0F, 0.0F, 0.0F, 20.0F, 7.0F, 52.0F, new CubeDeformation(0.0F))
		.texOffs(720, 852).addBox(-32.0F, 0.0F, 0.0F, 20.0F, 7.0F, 52.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(24.0F, 33.0F, 130.0F, -0.1353F, 0.0F, 0.0F));

		PartDefinition cube_r66 = InteriorClear.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(952, 911).addBox(12.0F, 0.0F, 0.0F, 20.0F, 7.0F, 38.0F, new CubeDeformation(0.0F))
		.texOffs(106, 927).addBox(-32.0F, 0.0F, 0.0F, 20.0F, 7.0F, 38.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(24.0F, 33.0F, -5.0F, -0.1876F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 2048, 2048);
	}

	@Override
	public void setupAnim(EntityRenderState renderState) {
		super.setupAnim(renderState);
		Propeller.zRot = renderState.ageInTicks + renderState.partialTick;
	}
}