package xyz.przemyk.simplesubs.client;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.entity.state.EntityRenderState;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
public class SubmarineModel extends EntityModel<EntityRenderState> {
	private final ModelPart Upgrades;
	private final ModelPart Propeller;
	private final ModelPart Hull;
	private final ModelPart Final;
	private final ModelPart InsideView;

	public SubmarineModel(ModelPart root) {
        super(root);
		this.Upgrades = root.getChild("Upgrades");
		this.Propeller = this.Upgrades.getChild("Propeller");
		this.Hull = root.getChild("Hull");
		this.Final = this.Hull.getChild("Final");
		this.InsideView = this.Hull.getChild("InsideView");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Upgrades = partdefinition.addOrReplaceChild("Upgrades", CubeListBuilder.create(), PartPose.offset(0.0F, -2.6541F, 81.225F));

		PartDefinition Propeller = Upgrades.addOrReplaceChild("Propeller", CubeListBuilder.create().texOffs(-41, -6).addBox(-1.5F, -16.614F, -4.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.01F))
		.texOffs(-41, -6).addBox(-1.5F, -21.885F, -4.0F, 3.0F, 6.0F, 8.0F, new CubeDeformation(-0.015F))
		.texOffs(-41, -6).mirror().addBox(-1.5F, -0.614F, -4.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.01F)).mirror(false)
		.texOffs(-41, -6).mirror().addBox(-1.5F, -5.885F, -4.0F, 3.0F, 6.0F, 8.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Propeller.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(-36, -2).addBox(0.0173F, 2.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2459F, 0.345F, 0.0F, 0.6545F, 2.3562F));

		PartDefinition cube_r2 = Propeller.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(-36, -2).mirror().addBox(-1.0173F, -7.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.2459F, 0.345F, 0.0F, -0.6545F, -2.3562F));

		PartDefinition cube_r3 = Propeller.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(-36, -2).addBox(0.0173F, 2.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2459F, 0.345F, 0.0F, 0.6545F, -2.3562F));

		PartDefinition cube_r4 = Propeller.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(-36, -2).mirror().addBox(-1.0173F, -7.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.2459F, 0.345F, 0.0F, -0.6545F, 2.3562F));

		PartDefinition cube_r5 = Propeller.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(-36, -2).addBox(0.0173F, 2.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2459F, 0.345F, 0.0F, 0.6545F, -3.1416F));

		PartDefinition cube_r6 = Propeller.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(-36, -2).mirror().addBox(-1.0173F, -7.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.2459F, 0.345F, 0.0F, -0.6545F, -3.1416F));

		PartDefinition cube_r7 = Propeller.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(-36, -2).mirror().addBox(-1.0173F, -7.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.2459F, 0.345F, 0.0F, -0.6545F, -1.5708F));

		PartDefinition cube_r8 = Propeller.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(-36, -2).addBox(0.0173F, 2.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2459F, 0.345F, 0.0F, 0.6545F, -1.5708F));

		PartDefinition cube_r9 = Propeller.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(-41, -6).mirror().addBox(-1.4974F, -3.638F, -4.345F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-41, -6).addBox(-1.4974F, 1.6329F, -4.345F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2459F, 0.345F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r10 = Propeller.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(-41, -6).addBox(-1.5026F, -3.638F, -4.345F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(-41, -6).mirror().addBox(-1.5026F, 1.6329F, -4.345F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.2459F, 0.345F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r11 = Propeller.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(-41, -6).mirror().addBox(-1.5036F, -3.3645F, -4.345F, 3.0F, 7.0F, 8.0F, new CubeDeformation(-0.01F)).mirror(false)
		.texOffs(-41, -6).mirror().addBox(-1.5036F, -3.6355F, -4.345F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.2459F, 0.345F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r12 = Propeller.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(-41, -6).mirror().addBox(-1.4974F, -3.638F, -4.345F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-41, -6).addBox(-1.4974F, 1.6329F, -4.345F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -18.2459F, 0.345F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r13 = Propeller.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(-41, -6).addBox(-1.5026F, -3.638F, -4.345F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(-41, -6).mirror().addBox(-1.5026F, 1.6329F, -4.345F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -18.2459F, 0.345F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r14 = Propeller.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(-41, -6).addBox(-1.4964F, -3.6355F, -4.345F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.01F))
		.texOffs(-41, -6).addBox(-1.4964F, -3.3645F, -4.345F, 3.0F, 7.0F, 8.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -18.2459F, 0.345F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r15 = Propeller.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(-36, -2).addBox(0.0173F, -7.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -18.2459F, 0.345F, 0.0F, 0.6545F, -2.3562F));

		PartDefinition cube_r16 = Propeller.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(-36, -2).mirror().addBox(-1.0173F, 2.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -18.2459F, 0.345F, 0.0F, -0.6545F, 2.3562F));

		PartDefinition cube_r17 = Propeller.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(-36, -2).addBox(0.0173F, -7.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -18.2459F, 0.345F, 0.0F, 0.6545F, 2.3562F));

		PartDefinition cube_r18 = Propeller.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(-36, -2).mirror().addBox(-1.0173F, 2.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -18.2459F, 0.345F, 0.0F, -0.6545F, -2.3562F));

		PartDefinition cube_r19 = Propeller.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(-36, -2).addBox(0.0173F, -7.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -18.2459F, 0.345F, 0.0F, 0.6545F, 3.1416F));

		PartDefinition cube_r20 = Propeller.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(-36, -2).mirror().addBox(-1.0173F, 2.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -18.2459F, 0.345F, 0.0F, -0.6545F, 3.1416F));

		PartDefinition cube_r21 = Propeller.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(-36, -2).addBox(0.0173F, -7.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -18.2459F, 0.345F, 0.0F, 0.6545F, 1.5708F));

		PartDefinition cube_r22 = Propeller.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(-36, -2).mirror().addBox(-1.0173F, 2.6355F, -1.1682F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -18.2459F, 0.345F, 0.0F, -0.6545F, 1.5708F));

		PartDefinition Hull = partdefinition.addOrReplaceChild("Hull", CubeListBuilder.create().texOffs(-22, -1).addBox(-60.0F, -33.0F, 79.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(25, 2).addBox(-57.25F, -21.0F, 123.9584F, 18.0F, 38.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(-52, -59).addBox(-74.25F, 13.0F, 75.925F, 34.0F, 0.0F, 61.0F, new CubeDeformation(0.0F))
		.texOffs(-11, -18).addBox(-57.25F, -2.0F, 74.0416F, 17.0F, 15.0F, 20.0F, new CubeDeformation(0.0F))
		.texOffs(-3, -10).addBox(-57.25F, -2.0F, 112.0416F, 17.0F, 15.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(-53, -12).addBox(-81.25F, -5.0F, 52.0F, 48.0F, 6.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(-53, -12).addBox(-81.25F, -5.0F, 148.0F, 48.0F, 6.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(-24, -1).addBox(-63.0F, -28.0F, 79.0F, 22.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(-24, -1).addBox(-63.0F, -28.0F, 121.0F, 22.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(-60, -37).addBox(-63.0F, -28.0F, 82.0F, 3.0F, 9.0F, 39.0F, new CubeDeformation(0.0F))
		.texOffs(-60, -37).addBox(-44.0F, -28.0F, 82.0F, 3.0F, 9.0F, 39.0F, new CubeDeformation(0.0F))
		.texOffs(-85, -43).addBox(-63.0F, -37.0F, 79.0F, 22.0F, 2.0F, 45.0F, new CubeDeformation(0.0F))
		.texOffs(-54, -12).addBox(-59.0F, -39.0F, 106.0F, 14.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(-91, -49).addBox(-61.25F, -24.725F, 147.225F, 8.0F, 7.0F, 51.0F, new CubeDeformation(0.01F))
		.texOffs(-91, -49).addBox(-61.25F, 14.275F, 147.245F, 8.0F, 7.0F, 51.0F, new CubeDeformation(0.01F))
		.texOffs(-43, -1).addBox(-61.25F, -24.725F, 198.245F, 8.0F, 46.0F, 3.0F, new CubeDeformation(0.01F))
		.texOffs(-91, -49).mirror().addBox(-78.25F, 10.0F, 147.245F, 8.0F, 7.0F, 51.0F, new CubeDeformation(0.01F)).mirror(false)
		.texOffs(-91, -49).mirror().addBox(-78.25F, -5.0F, 147.245F, 8.0F, 6.0F, 51.0F, new CubeDeformation(0.01F)).mirror(false)
		.texOffs(-91, -49).addBox(-44.25F, -5.0F, 147.245F, 8.0F, 6.0F, 51.0F, new CubeDeformation(0.01F))
		.texOffs(-91, -49).addBox(-44.25F, 10.0F, 147.245F, 8.0F, 7.0F, 51.0F, new CubeDeformation(0.01F))
		.texOffs(-44, 2).addBox(-65.25F, -18.4113F, 172.225F, 16.0F, 33.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(-50, -14).mirror().addBox(-59.25F, 8.9319F, 167.225F, 4.0F, 2.0F, 16.0F, new CubeDeformation(0.01F)).mirror(false)
		.texOffs(-50, -14).mirror().addBox(-59.25F, 1.275F, 167.225F, 4.0F, 2.0F, 16.0F, new CubeDeformation(0.01F)).mirror(false)
		.texOffs(-50, -14).mirror().addBox(-59.25F, -14.725F, 167.225F, 4.0F, 2.0F, 16.0F, new CubeDeformation(0.01F)).mirror(false)
		.texOffs(-50, -14).mirror().addBox(-59.25F, -7.0682F, 167.225F, 4.0F, 2.0F, 16.0F, new CubeDeformation(0.01F)).mirror(false)
		.texOffs(-24, -1).addBox(-63.0F, -35.0F, 79.0F, 22.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(-24, -1).addBox(-63.0F, -35.0F, 121.0F, 22.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(-60, -37).addBox(-63.0F, -35.0F, 82.0F, 3.0F, 2.0F, 39.0F, new CubeDeformation(0.0F))
		.texOffs(-60, -37).addBox(-44.0F, -35.0F, 82.0F, 3.0F, 2.0F, 39.0F, new CubeDeformation(0.0F))
		.texOffs(-35, -12).addBox(-63.0F, -33.0F, 94.0F, 3.0F, 5.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(-35, -12).addBox(-44.0F, -33.0F, 94.0F, 3.0F, 5.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(-25, -2).addBox(-63.0F, -33.0F, 79.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(-25, -2).addBox(-44.0F, -33.0F, 79.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(-43, -1).addBox(-63.0F, -33.0F, 121.0F, 22.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(-22, 1).addBox(-44.0F, -33.0F, 120.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-22, 1).addBox(-63.0F, -33.0F, 120.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-22, -1).addBox(-45.0F, -33.0F, 79.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(57.25F, -11.0F, -106.0F));

		PartDefinition cube_r23 = Hull.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(-41, 1).addBox(2.5F, -3.5F, -1.25F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-41, 1).addBox(-2.5F, 2.5F, -1.25F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-41, 1).addBox(-3.5F, -3.5F, -1.25F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-41, 1).addBox(-3.5F, -2.5F, -1.25F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-53, -11).addBox(-3.5F, -3.5F, -0.25F, 7.0F, 7.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-64.5F, 20.5F, 54.25F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r24 = Hull.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(-50, -14).mirror().addBox(6.5F, -9.6568F, -11.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-62.0784F, -18.3966F, 178.225F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r25 = Hull.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(-54, -14).mirror().addBox(-6.3033F, 12.9602F, -11.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-61.3613F, -20.0937F, 178.235F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r26 = Hull.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(-54, -14).addBox(2.3033F, 12.9602F, -11.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-53.1387F, -20.0937F, 178.235F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r27 = Hull.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(-50, -14).addBox(-10.5F, -9.6568F, -11.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-52.4216F, -18.3966F, 178.225F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r28 = Hull.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(-54, -14).addBox(2.3033F, -14.9602F, -11.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-53.1387F, 0.3005F, 178.235F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r29 = Hull.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(-54, -14).mirror().addBox(-6.3033F, -14.9602F, -11.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-61.3613F, 0.3005F, 178.235F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r30 = Hull.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(-50, -14).mirror().addBox(6.5F, -9.6568F, -11.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-62.0784F, -2.3966F, 178.225F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r31 = Hull.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(-54, -14).addBox(2.3033F, -14.9602F, -11.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-53.1387F, 16.3005F, 178.235F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r32 = Hull.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(-54, -14).mirror().addBox(-6.3033F, -14.9602F, -11.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-61.3613F, 16.3005F, 178.235F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r33 = Hull.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(-54, -14).mirror().addBox(-6.3033F, 12.9602F, -11.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-61.3613F, -4.0937F, 178.235F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r34 = Hull.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(-50, -14).addBox(-10.5F, -9.6568F, -11.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-52.4216F, -2.3966F, 178.225F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r35 = Hull.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(-54, -14).addBox(2.3033F, 12.9602F, -11.0F, 4.0F, 2.0F, 16.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-53.1387F, -4.0937F, 178.235F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r36 = Hull.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(-58, -16).mirror().addBox(-9.3033F, 12.9602F, -12.0F, 8.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-57.25F, -0.5682F, 178.225F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r37 = Hull.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(-71, -16).mirror().addBox(-13.5F, -9.6568F, -12.0F, 25.0F, 2.0F, 18.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-57.25F, -0.5682F, 178.225F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r38 = Hull.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(-54, -16).mirror().addBox(-9.3033F, -14.9601F, -12.0F, 8.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-57.25F, -2.5682F, 178.225F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r39 = Hull.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(-58, -16).addBox(1.3033F, 12.9602F, -12.0F, 8.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-57.25F, -0.5682F, 178.225F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r40 = Hull.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(-54, -16).addBox(1.3033F, -14.9601F, -12.0F, 8.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-57.25F, -2.5682F, 178.225F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r41 = Hull.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(-46, -4).addBox(-3.0F, -15.5F, -3.0F, 6.0F, 19.0F, 6.0F, new CubeDeformation(-0.17F)), PartPose.offsetAndRotation(-40.25F, 10.5F, 198.245F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r42 = Hull.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(-48, -10).mirror().addBox(0.0F, -3.0F, 0.0F, 4.0F, 22.0F, 12.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-44.25F, -2.0F, 198.245F, 0.0F, 0.1614F, 0.0F));

		PartDefinition cube_r43 = Hull.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(-48, -10).addBox(-4.0F, -3.0F, 0.0F, 4.0F, 22.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-36.25F, -2.0F, 198.245F, 0.0F, -0.1614F, 0.0F));

		PartDefinition cube_r44 = Hull.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(-48, -10).addBox(-4.0F, -3.0F, 0.0F, 4.0F, 22.0F, 12.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-70.25F, -2.0F, 198.245F, 0.0F, -0.1614F, 0.0F));

		PartDefinition cube_r45 = Hull.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(-48, -10).mirror().addBox(0.0F, -3.0F, 0.0F, 4.0F, 22.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-78.25F, -2.0F, 198.245F, 0.0F, 0.1614F, 0.0F));

		PartDefinition cube_r46 = Hull.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(-46, -4).addBox(-3.0F, -28.5F, -3.0F, 6.0F, 32.0F, 6.0F, new CubeDeformation(-0.17F)), PartPose.offsetAndRotation(-57.25F, 10.775F, 198.245F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r47 = Hull.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(-48, -10).mirror().addBox(0.0F, -23.0F, 0.0F, 4.0F, 46.0F, 12.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-61.25F, -1.725F, 201.245F, 0.0F, 0.1614F, 0.0F));

		PartDefinition cube_r48 = Hull.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(-48, -10).addBox(-4.0F, -23.0F, 0.0F, 4.0F, 46.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-53.25F, -1.725F, 201.245F, 0.0F, -0.1614F, 0.0F));

		PartDefinition cube_r49 = Hull.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(-69, -16).addBox(-11.5F, -9.6568F, -12.0F, 25.0F, 2.0F, 18.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-57.25F, -0.5682F, 178.225F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r50 = Hull.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(-3, -43).addBox(-8.0F, 0.0F, 35.0F, 8.0F, 3.0F, 45.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-33.25F, -20.0F, 44.0F, 0.0F, 0.0F, 0.2854F));

		PartDefinition cube_r51 = Hull.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(-2, -2).addBox(-3.5F, -5.5F, 9.5F, 0.0F, 22.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(-2, -2).mirror().addBox(44.3733F, -5.5F, 9.5F, 0.0F, 22.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-77.6992F, -5.8383F, 141.4247F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r52 = Hull.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(-18, -18).mirror().addBox(3.5F, -16.5F, -6.5F, 0.0F, 22.0F, 20.0F, new CubeDeformation(0.01F)).mirror(false)
		.texOffs(-18, -18).addBox(-44.3483F, -16.5F, -6.5F, 0.0F, 22.0F, 20.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-36.8259F, 2.8383F, 141.4247F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r53 = Hull.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(5, -2).mirror().addBox(3.5F, -5.5F, -13.5F, 0.0F, 22.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-2, -2).addBox(-44.4233F, -5.5F, -13.5F, 0.0F, 22.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-36.8008F, -5.8383F, 72.5753F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r54 = Hull.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(12, -22).addBox(0.0F, 0.0F, -24.0F, 24.0F, 0.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-57.239F, -26.9376F, 66.0F, 0.2938F, -0.0848F, 0.2728F));

		PartDefinition cube_r55 = Hull.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(1, -22).mirror().addBox(-24.0F, 0.0F, -24.0F, 24.0F, 0.0F, 24.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-57.261F, -26.9376F, 66.0F, 0.2938F, 0.0848F, -0.2728F));

		PartDefinition cube_r56 = Hull.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(-32, -32).addBox(-17.0F, -3.5F, -17.0F, 34.0F, 37.0F, 34.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-57.25F, -16.5F, 66.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r57 = Hull.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(-1, -1).addBox(-2.0F, 23.0F, 2.0F, 4.0F, 21.0F, 3.0F, new CubeDeformation(0.35F)), PartPose.offsetAndRotation(-57.25F, -37.45F, 58.775F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r58 = Hull.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(-11, -18).mirror().addBox(3.5F, -16.5F, -13.5F, 0.0F, 22.0F, 20.0F, new CubeDeformation(0.01F)).mirror(false)
		.texOffs(-11, -18).addBox(-44.3983F, -16.5F, -13.5F, 0.0F, 22.0F, 20.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-36.8008F, 2.8383F, 72.5753F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r59 = Hull.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(-1, -1).addBox(-2.0F, -44.0F, 2.0F, 4.0F, 21.0F, 3.0F, new CubeDeformation(0.35F)), PartPose.offsetAndRotation(-57.25F, 34.45F, 58.775F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r60 = Hull.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(-32, -32).addBox(-17.0F, -3.5F, -17.0F, 34.0F, 6.0F, 34.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-57.25F, -1.5F, 52.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r61 = Hull.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(-32, -32).addBox(-17.0F, -3.5F, -17.0F, 34.0F, 37.0F, 34.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-57.25F, -16.5F, 148.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r62 = Hull.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(-32, -32).addBox(-17.0F, -3.5F, -17.0F, 34.0F, 6.0F, 34.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-57.25F, -1.5F, 162.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r63 = Hull.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(12, -22).addBox(0.0F, 0.0F, -12.0F, 13.0F, 3.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-41.6936F, -5.0F, 170.4853F, -0.1084F, -0.7795F, 0.1537F));

		PartDefinition cube_r64 = Hull.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(12, -22).addBox(0.0F, -3.0F, -12.0F, 13.0F, 3.0F, 24.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-41.6936F, 1.0F, 170.4853F, 0.1084F, -0.7795F, -0.1537F));

		PartDefinition cube_r65 = Hull.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(12, -22).mirror().addBox(-13.0F, -3.0F, -12.0F, 13.0F, 3.0F, 24.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-72.8063F, 1.0F, 170.4853F, 0.1084F, 0.7795F, 0.1537F));

		PartDefinition cube_r66 = Hull.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(12, -22).mirror().addBox(-13.0F, 0.0F, -12.0F, 13.0F, 3.0F, 24.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-72.8063F, -5.0F, 170.4853F, -0.1084F, 0.7795F, -0.1537F));

		PartDefinition cube_r67 = Hull.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(-57, -80).addBox(-25.0F, -7.0F, 41.0F, 25.0F, 7.0F, 82.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-33.25F, 17.0F, 25.0F, 0.0F, 0.0F, -0.2854F));

		PartDefinition cube_r68 = Hull.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(-58, -80).mirror().addBox(0.0F, -7.0F, 41.0F, 25.0F, 7.0F, 82.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-81.25F, 17.0F, 25.0F, 0.0F, 0.0F, 0.2854F));

		PartDefinition cube_r69 = Hull.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(-19, -67).addBox(-6.0F, -5.5F, -34.0F, 12.0F, 11.0F, 69.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-38.25F, 24.2F, 107.0F, 0.0F, 0.0F, -0.2854F));

		PartDefinition cube_r70 = Hull.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(-19, -67).mirror().addBox(-6.0F, -5.5F, -34.0F, 12.0F, 11.0F, 69.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-76.25F, 24.2F, 107.0F, 0.0F, 0.0F, 0.2854F));

		PartDefinition Final = Hull.addOrReplaceChild("Final", CubeListBuilder.create(), PartPose.offset(-59.25F, -20.9077F, 167.89F));

		PartDefinition cube_r71 = Final.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(-21, 2).addBox(-27.0F, -11.0F, 0.0F, 24.0F, 34.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.375F, 0.0F, 0.0F, 0.8452F, -0.4637F, -0.467F));

		PartDefinition cube_r72 = Final.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(-18, 2).mirror().addBox(3.0F, -11.0F, 0.0F, 24.0F, 34.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.35F, 0.0F, 0.0F, 0.8452F, 0.4637F, 0.467F));

		PartDefinition cube_r73 = Final.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(-18, 2).mirror().addBox(3.0F, -23.0F, 0.0F, 24.0F, 34.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.35F, 38.8153F, 0.0F, -0.8452F, 0.4637F, -0.467F));

		PartDefinition cube_r74 = Final.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(-21, 2).addBox(-27.0F, -23.0F, 0.0F, 24.0F, 34.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.375F, 38.8153F, 0.0F, -0.8452F, -0.4637F, 0.467F));

		PartDefinition cube_r75 = Final.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(-21, 2).mirror().addBox(0.0F, -23.0F, 0.0F, 27.0F, 34.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.35F, 38.8153F, -121.78F, 0.8452F, -0.4637F, -0.467F));

		PartDefinition cube_r76 = Final.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(-21, 2).addBox(-27.0F, -23.0F, 0.0F, 27.0F, 34.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.375F, 38.8153F, -121.78F, 0.8452F, 0.4637F, 0.467F));

		PartDefinition cube_r77 = Final.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(-21, 2).addBox(-27.0F, -11.0F, 0.0F, 27.0F, 34.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.375F, 0.0F, -121.78F, -0.8452F, 0.4637F, -0.467F));

		PartDefinition cube_r78 = Final.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(-21, 2).mirror().addBox(0.0F, -11.0F, 0.0F, 27.0F, 34.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.35F, 0.0F, -121.78F, -0.8452F, -0.4637F, 0.467F));

		PartDefinition InsideView = Hull.addOrReplaceChild("InsideView", CubeListBuilder.create().texOffs(-80, -80).mirror().addBox(-24.0F, -33.0F, -10.0F, 7.0F, 6.0F, 82.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-34, -34).mirror().addBox(-24.0F, -17.0F, 36.0F, 7.0F, 21.0F, 36.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-44, -44).mirror().addBox(-24.0F, -8.0F, -10.0F, 7.0F, 12.0F, 46.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-10, -10).mirror().addBox(-24.0F, -21.0F, -10.0F, 7.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-14, -14).mirror().addBox(-24.0F, -17.0F, 11.0F, 7.0F, 9.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-38, -38).mirror().addBox(-24.0F, -21.0F, 2.0F, 7.0F, 4.0F, 40.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-1, -1).addBox(-24.0F, -27.0F, 39.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(-1, -1).addBox(-24.0F, -27.0F, 26.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(-45, -47).addBox(-22.0F, -27.0F, 3.0F, 5.0F, 4.0F, 49.0F, new CubeDeformation(0.0F))
		.texOffs(-1, -1).addBox(-24.0F, -27.0F, 13.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(-47, -47).addBox(-24.0F, -23.0F, 3.0F, 7.0F, 2.0F, 49.0F, new CubeDeformation(0.0F))
		.texOffs(-19, -21).addBox(-22.0F, -21.0F, 42.0F, 5.0F, 4.0F, 23.0F, new CubeDeformation(0.0F))
		.texOffs(-5, -5).addBox(-24.0F, -21.0F, 65.0F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(-1, -1).addBox(-24.0F, -21.0F, 52.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(-11, -11).addBox(-24.0F, -27.0F, -10.0F, 2.0F, 6.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(-18, -18).addBox(-24.0F, -27.0F, 52.0F, 2.0F, 6.0F, 20.0F, new CubeDeformation(0.0F))
		.texOffs(-11, -11).mirror().addBox(22.0F, -27.0F, -10.0F, 2.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-15, -15).mirror().addBox(17.0F, -23.0F, 35.0F, 7.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-9, -4).mirror().addBox(17.0F, -27.0F, 13.0F, 7.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-10, -5).mirror().addBox(17.0F, -27.0F, 35.0F, 7.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-18, -18).mirror().addBox(22.0F, -27.0F, 52.0F, 2.0F, 6.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-5, -5).mirror().addBox(22.0F, -21.0F, 65.0F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-35, -35).addBox(17.0F, -17.0F, 35.0F, 7.0F, 21.0F, 37.0F, new CubeDeformation(0.0F))
		.texOffs(-5, -5).addBox(17.0F, -21.0F, 35.0F, 7.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(-19, -21).mirror().addBox(17.0F, -21.0F, 42.0F, 5.0F, 4.0F, 23.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-6, -8).mirror().addBox(17.0F, -27.0F, 3.0F, 5.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-6, -8).mirror().addBox(17.0F, -27.0F, 42.0F, 5.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-1, -1).mirror().addBox(22.0F, -21.0F, 52.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-80, -80).addBox(17.0F, -33.0F, -10.0F, 7.0F, 6.0F, 82.0F, new CubeDeformation(0.0F))
		.texOffs(-14, -14).addBox(17.0F, -3.0F, 19.0F, 7.0F, 7.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(-12, -14).addBox(19.0F, -27.0F, 19.0F, 3.0F, 24.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(-27, -27).addBox(17.0F, -17.0F, -10.0F, 7.0F, 21.0F, 29.0F, new CubeDeformation(0.0F))
		.texOffs(-27, -27).addBox(17.0F, -21.0F, -10.0F, 7.0F, 4.0F, 29.0F, new CubeDeformation(0.0F))
		.texOffs(-14, -14).mirror().addBox(17.0F, -23.0F, 3.0F, 7.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-57.25F, 13.0F, 76.0F));

		PartDefinition cube_r79 = InsideView.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(-21, -43).mirror().addBox(0.0F, 0.0F, 35.0F, 20.0F, 6.0F, 45.0F, new CubeDeformation(0.01F)).mirror(false)
		.texOffs(11, -11).mirror().addBox(0.0F, 0.0F, 22.0F, 25.0F, 7.0F, 13.0F, new CubeDeformation(0.02F)).mirror(false)
		.texOffs(0, -22).mirror().addBox(0.0F, 0.0F, 80.0F, 25.0F, 6.0F, 24.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-24.0F, -33.0F, -32.0F, 0.0F, 0.0F, -0.2854F));

		PartDefinition cube_r80 = InsideView.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(12, -11).addBox(-25.0F, 0.0F, -123.0F, 25.0F, 7.0F, 13.0F, new CubeDeformation(0.01F))
		.texOffs(1, -22).addBox(-25.0F, 0.0F, -65.0F, 25.0F, 6.0F, 24.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(24.0F, -33.0F, 113.0F, 0.0F, 0.0F, 0.2854F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(EntityRenderState renderState) {
		super.setupAnim(renderState);
		Propeller.zRot = renderState.ageInTicks + renderState.partialTick;
	}
}