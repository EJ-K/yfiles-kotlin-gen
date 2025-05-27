// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Enum constants to define the parallel substructure style in the [OrganicLayout]
 * @see [OrganicLayout.parallelSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelSubstructureStyle">Online Documentation</a>
 */
external sealed class ParallelSubstructureStyle: YEnum<ParallelSubstructureStyle> {
   companion object: EnumMetadata<ParallelSubstructureStyle> {
       /**
 * Substructure style specifier for parallel structures that indicates that the algorithm does not handle such structures in a special way.
 * 
 * Value - `0`
 * @see [OrganicLayout.parallelSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelSubstructureStyle%23NONE">Online Documentation</a>
 */
val NONE: ParallelSubstructureStyle

/**
 * Substructure style specifier for parallel structures that leads to a (rotated) rectangular layout style for the inner nodes.
 * 
 * Value - `1`
 * @see [OrganicLayout.parallelSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelSubstructureStyle%23RECTANGULAR">Online Documentation</a>
 */
val RECTANGULAR: ParallelSubstructureStyle

/**
 * Substructure style specifier for parallel structures that places the inner nodes on a straight-line.
 * 
 * Value - `2`
 * @see [OrganicLayout.parallelSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelSubstructureStyle%23STRAIGHT_LINE">Online Documentation</a>
 */
val STRAIGHT_LINE: ParallelSubstructureStyle

/**
 * Substructure style specifier for parallel structures that leads to a radial layout style for the inner nodes.
 * 
 * Value - `3`
 * @see [OrganicLayout.parallelSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelSubstructureStyle%23RADIAL">Online Documentation</a>
 */
val RADIAL: ParallelSubstructureStyle
   }
}
