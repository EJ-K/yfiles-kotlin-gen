// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.orthogonal

import yfiles.lang.ClassMetadata
import yfiles.layout.PartitionLayout

/**
 * This layout algorithm arranges a graph in a compact, orthogonal fashion.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactOrthogonalLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [CompactOrthogonalLayout] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactOrthogonalLayout%23CompactOrthogonalLayout-constructor-CompactOrthogonalLayout">Online Documentation</a>
 */
external open class CompactOrthogonalLayout  () : PartitionLayout {

/**
 * Gets or sets the desired aspect ratio (that is the quotient width/height) of the resulting layout bounds.
 * 
 * Default value - `1`
 * @throws ArgumentError if the given aspect ratio is less than or equal to zero
 * @see [PartitionLayout.partitionPlacer]
 * @see [PartitionLayout.createComponentPartitionPlacer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactOrthogonalLayout%23aspectRatio">Online Documentation</a>
 */
open var aspectRatio: Double
/**
 * Gets or sets the equidistant spacing between the horizontal and vertical grid lines.
 * 
 * Default value - `20`
 * @throws ArgumentError if the grid spacing is negative or zero
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactOrthogonalLayout%23gridSpacing">Online Documentation</a>
 */
open var gridSpacing: Double

companion object : ClassMetadata<CompactOrthogonalLayout> {
}
}

inline fun CompactOrthogonalLayout(
    block: CompactOrthogonalLayout.() -> Unit
): CompactOrthogonalLayout {
    return CompactOrthogonalLayout()
        .apply(block)
}
