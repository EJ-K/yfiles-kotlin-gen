// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.YFlags

/**
 * @see [EdgeLabelOrientationSupport.getOrientedDirection]
 * @see [EdgeLabelOrientationSupport.isOrientationMirrored]
 * @see [HierarchicLayout.getMirrorMode][yfiles.hierarchic.HierarchicLayout.getMirrorMode]
 * @see [PortConstraintOptimizerBase.mirrorMode][yfiles.hierarchic.PortConstraintOptimizerBase.mirrorMode]
 * @see [OrientationLayout.mirrorMode]
 * @see [PortCandidate.getXOffsetForLayoutOrientation]
 * @see [PortCandidate.getYOffsetForLayoutOrientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MirrorModes">Online Documentation</a>
 */
external class MirrorModes 
    private constructor(): YFlags<MirrorModes> {
    companion object {
    /**
 * Mirroring specifier that can be used for preventing any mirroring of layout orientations.
 * 
 * Value - `0`
 * @see [OrientationLayout.mirrorMode]
 * @see [OrientationLayout.orientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MirrorModes%23NONE">Online Documentation</a>
 */
val NONE: MirrorModes
/**
 * Mirroring specifier that defines that layout orientation [LayoutOrientation.TOP_TO_BOTTOM] will be mirrored.
 * 
 * Value - `1`
 * @see [OrientationLayout.mirrorMode]
 * @see [OrientationLayout.orientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MirrorModes%23TOP_TO_BOTTOM">Online Documentation</a>
 */
val TOP_TO_BOTTOM: MirrorModes
/**
 * Mirroring specifier that defines that layout orientation [LayoutOrientation.RIGHT_TO_LEFT] will be mirrored.
 * 
 * Value - `2`
 * @see [OrientationLayout.mirrorMode]
 * @see [OrientationLayout.orientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MirrorModes%23RIGHT_TO_LEFT">Online Documentation</a>
 */
val RIGHT_TO_LEFT: MirrorModes
/**
 * Mirroring specifier that defines that layout orientation [LayoutOrientation.BOTTOM_TO_TOP] will be mirrored.
 * 
 * Value - `4`
 * @see [OrientationLayout.mirrorMode]
 * @see [OrientationLayout.orientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MirrorModes%23BOTTOM_TO_TOP">Online Documentation</a>
 */
val BOTTOM_TO_TOP: MirrorModes
/**
 * Mirroring specifier that defines that layout orientation [LayoutOrientation.LEFT_TO_RIGHT] will be mirrored.
 * 
 * Value - `8`
 * @see [OrientationLayout.mirrorMode]
 * @see [OrientationLayout.orientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MirrorModes%23LEFT_TO_RIGHT">Online Documentation</a>
 */
val LEFT_TO_RIGHT: MirrorModes

    }
}
