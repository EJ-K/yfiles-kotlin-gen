// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.orthogonal

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Orientation specifier that defines that the layout orientation of substructures is top to bottom.
 * @see [OrthogonalLayout.treeOrientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubstructureOrientation">Online Documentation</a>
 */
external sealed class SubstructureOrientation: YEnum<SubstructureOrientation> {
   companion object: EnumMetadata<SubstructureOrientation> {
       /**
 * Orientation specifier that defines that the layout orientation of substructures is top to bottom.
 * 
 * Value - `0`
 * @see [OrthogonalLayout.treeOrientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubstructureOrientation%23TOP_TO_BOTTOM">Online Documentation</a>
 */
val TOP_TO_BOTTOM: SubstructureOrientation

/**
 * Orientation specifier that defines that the layout orientation of substructures is left to right.
 * 
 * Value - `1`
 * @see [OrthogonalLayout.treeOrientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubstructureOrientation%23LEFT_TO_RIGHT">Online Documentation</a>
 */
val LEFT_TO_RIGHT: SubstructureOrientation

/**
 * Orientation specifier that defines that the layout orientation of substructures is bottom to top.
 * 
 * Value - `2`
 * @see [OrthogonalLayout.treeOrientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubstructureOrientation%23BOTTOM_TO_TOP">Online Documentation</a>
 */
val BOTTOM_TO_TOP: SubstructureOrientation

/**
 * Orientation specifier that defines that the layout orientation of substructures is right to left.
 * 
 * Value - `3`
 * @see [OrthogonalLayout.treeOrientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubstructureOrientation%23RIGHT_TO_LEFT">Online Documentation</a>
 */
val RIGHT_TO_LEFT: SubstructureOrientation

/**
 * Orientation specifier that defines that the layout orientation of substructures is chosen automatically.
 * 
 * Value - `4`
 * @see [OrthogonalLayout.treeOrientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubstructureOrientation%23AUTO_DETECT">Online Documentation</a>
 */
val AUTO_DETECT: SubstructureOrientation
   }
}
