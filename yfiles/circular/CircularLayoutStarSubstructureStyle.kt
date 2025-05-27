// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.circular

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [CircularLayout.starSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutStarSubstructureStyle">Online Documentation</a>
 */
external sealed class CircularLayoutStarSubstructureStyle: YEnum<CircularLayoutStarSubstructureStyle> {
   companion object: EnumMetadata<CircularLayoutStarSubstructureStyle> {
       /**
 * Substructure style specifier for stars that indicates that the algorithm does not handle such structures in a special way.
 * 
 * Value - `0`
 * @see [CircularLayout.starSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutStarSubstructureStyle%23NONE">Online Documentation</a>
 */
val NONE: CircularLayoutStarSubstructureStyle

/**
 * Substructure style specifier for stars that leads to a radial layout style for stars where the root is placed in the middle and the edges are routed as straight lines.
 * 
 * Value - `1`
 * @see [CircularLayout.starSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutStarSubstructureStyle%23RADIAL">Online Documentation</a>
 */
val RADIAL: CircularLayoutStarSubstructureStyle

/**
 * Substructure style specifier for stars that leads to a radial layout style for stars where the root is placed on the outside (separated from the nodes with degree one).
 * 
 * Value - `2`
 * @see [CircularLayout.starSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutStarSubstructureStyle%23SEPARATED_RADIAL">Online Documentation</a>
 */
val SEPARATED_RADIAL: CircularLayoutStarSubstructureStyle
   }
}
