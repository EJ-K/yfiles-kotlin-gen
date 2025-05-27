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
 * Orientation specifier which defines that the main layout orientation is from top to bottom.
 * @see [EdgeLabelOrientationSupport.getOrientedDirection]
 * @see [EdgeLabelOrientationSupport.isOrientationMirrored]
 * @see [PortConstraintOptimizerBase.layoutOrientation][yfiles.hierarchic.PortConstraintOptimizerBase.layoutOrientation]
 * @see [MultiStageLayout.layoutOrientation]
 * @see [OrientationLayout]
 * @see [OrientationLayout.isOrientationMirrored]
 * @see [OrientationLayout.orientation]
 * @see [PortCandidate.getDirectionForLayoutOrientation]
 * @see [PortCandidate.getXOffsetForLayoutOrientation]
 * @see [PortCandidate.getYOffsetForLayoutOrientation]
 * @see [PortCandidate.toPortConstraintForLayoutOrientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutOrientation">Online Documentation</a>
 */
external sealed class LayoutOrientation: YEnum<LayoutOrientation> {
   companion object: EnumMetadata<LayoutOrientation> {
       /**
 * Orientation specifier which defines that the main layout orientation is from top to bottom.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutOrientation%23TOP_TO_BOTTOM">Online Documentation</a>
 */
val TOP_TO_BOTTOM: LayoutOrientation

/**
 * Orientation specifier which defines that the main layout orientation is from left to right.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutOrientation%23LEFT_TO_RIGHT">Online Documentation</a>
 */
val LEFT_TO_RIGHT: LayoutOrientation

/**
 * Orientation specifier which defines that the main layout orientation is from bottom to top.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutOrientation%23BOTTOM_TO_TOP">Online Documentation</a>
 */
val BOTTOM_TO_TOP: LayoutOrientation

/**
 * Orientation specifier which defines that the main layout orientation is from right to left.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutOrientation%23RIGHT_TO_LEFT">Online Documentation</a>
 */
val RIGHT_TO_LEFT: LayoutOrientation
   }
}
