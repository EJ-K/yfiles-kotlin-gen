// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [DefaultLayeredComponentsMerger]
 * @see [DefaultLayeredComponentsMerger.policy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MergingPolicy">Online Documentation</a>
 */
external sealed class MergingPolicy: YEnum<MergingPolicy> {
   companion object: EnumMetadata<MergingPolicy> {
       /**
 * A constant that adds the new layers of the source [layering][ILayers] below the layers of the target [layering][ILayers].
 * 
 * Value - `0`
 * @see [DefaultLayeredComponentsMerger.policy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MergingPolicy%23ADD_BELOW">Online Documentation</a>
 */
val ADD_BELOW: MergingPolicy

/**
 * A constant that adds the new layers of the source [layering][ILayers] above the layers of the target [layering][ILayers].
 * 
 * Value - `1`
 * @see [DefaultLayeredComponentsMerger.policy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MergingPolicy%23ADD_ABOVE">Online Documentation</a>
 */
val ADD_ABOVE: MergingPolicy

/**
 * A constant that adds the new layers of the source [layering][ILayers] to the right of the layers of the target layering.
 * 
 * Value - `18`
 * @see [DefaultLayeredComponentsMerger.policy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MergingPolicy%23ADD_RIGHT_TOP_ALIGNED">Online Documentation</a>
 */
val ADD_RIGHT_TOP_ALIGNED: MergingPolicy

/**
 * A constant that adds the new layers of the source [layering][ILayers] to the left of the layers of the target [layering][ILayers].
 * 
 * Value - `19`
 * @see [DefaultLayeredComponentsMerger.policy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MergingPolicy%23ADD_LEFT_TOP_ALIGNED">Online Documentation</a>
 */
val ADD_LEFT_TOP_ALIGNED: MergingPolicy

/**
 * A constant that adds the new layers of the source [layering][ILayers] to the right of the layers of the target [layering][ILayers].
 * 
 * Value - `34`
 * @see [DefaultLayeredComponentsMerger.policy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MergingPolicy%23ADD_RIGHT_BOTTOM_ALIGNED">Online Documentation</a>
 */
val ADD_RIGHT_BOTTOM_ALIGNED: MergingPolicy

/**
 * A constant that adds the new layers of the source [layering][ILayers] to the left of the layers of the target [layering][ILayers].
 * 
 * Value - `35`
 * @see [DefaultLayeredComponentsMerger.policy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MergingPolicy%23ADD_LEFT_BOTTOM_ALIGNED">Online Documentation</a>
 */
val ADD_LEFT_BOTTOM_ALIGNED: MergingPolicy

/**
 * A constant that adds the new layers of the source [layering][ILayers] to the right of the layers of the target [layering][ILayers].
 * 
 * Value - `66`
 * @see [DefaultLayeredComponentsMerger.policy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MergingPolicy%23ADD_RIGHT_CENTER_ALIGNED">Online Documentation</a>
 */
val ADD_RIGHT_CENTER_ALIGNED: MergingPolicy

/**
 * A constant that adds the new layers of the source [layering][ILayers] to the left of the layers of the target [layering][ILayers].
 * 
 * Value - `67`
 * @see [DefaultLayeredComponentsMerger.policy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MergingPolicy%23ADD_LEFT_CENTER_ALIGNED">Online Documentation</a>
 */
val ADD_LEFT_CENTER_ALIGNED: MergingPolicy
   }
}
