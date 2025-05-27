// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [GraphTransformer.operation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OperationType">Online Documentation</a>
 */
external sealed class OperationType: YEnum<OperationType> {
   companion object: EnumMetadata<OperationType> {
       /**
 * Operation specifier defining that the graph will be mirrored at the x-axis.
 * 
 * Value - `0`
 * @see [GraphTransformer.operation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OperationType%23MIRROR_X_AXIS">Online Documentation</a>
 */
val MIRROR_X_AXIS: OperationType

/**
 * Operation specifier defining that the graph will be mirrored at the y-axis.
 * 
 * Value - `1`
 * @see [GraphTransformer.operation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OperationType%23MIRROR_Y_AXIS">Online Documentation</a>
 */
val MIRROR_Y_AXIS: OperationType

/**
 * Operation specifier defining that the graph will be rotated.
 * 
 * Value - `2`
 * @see [GraphTransformer.operation]
 * @see [GraphTransformer.rotationAngle]
 * @see [GraphTransformer.bestFitRotationEnabled]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OperationType%23ROTATE">Online Documentation</a>
 */
val ROTATE: OperationType

/**
 * Operation specifier defining that the graph will be scaled.
 * 
 * Value - `3`
 * @see [GraphTransformer.operation]
 * @see [GraphTransformer.scaleFactor]
 * @see [GraphTransformer.setScaleFactors]
 * @see [GraphTransformer.scaleNodeSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OperationType%23SCALE">Online Documentation</a>
 */
val SCALE: OperationType

/**
 * Operation specifier defining that the graph will be translated.
 * 
 * Value - `4`
 * @see [GraphTransformer.operation]
 * @see [GraphTransformer.translateX]
 * @see [GraphTransformer.translateY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OperationType%23TRANSLATE">Online Documentation</a>
 */
val TRANSLATE: OperationType
   }
}
