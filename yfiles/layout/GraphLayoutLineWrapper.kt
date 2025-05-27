// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.ClassMetadata

/**
 * [GraphLayoutLineWrapper] can line-wrap or column-wrap a graph layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphLayoutLineWrapper">Online Documentation</a>
 * 
 * @constructor Creates a new [GraphLayoutLineWrapper] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphLayoutLineWrapper%23GraphLayoutLineWrapper-constructor-GraphLayoutLineWrapper">Online Documentation</a>
 */
external open class GraphLayoutLineWrapper  () : LayoutStageBase {

/**
 * Gets or sets whether this [ILayoutStage] wraps lines/rows or columns.
 * 
 * Default value - `false`. The layout is wrapped horizontally, producing rows.
 * @see [fixedWidth]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphLayoutLineWrapper%23columnMode">Online Documentation</a>
 */
open var columnMode: Boolean
/**
 * Gets or sets the space that should be kept between edges.
 * 
 * Default value - `5`
 * @throws ArgumentError if the given spacing is a negative value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphLayoutLineWrapper%23edgeSpacing">Online Documentation</a>
 */
open var edgeSpacing: Double
/**
 * Gets or sets the desired width of the lines.
 * 
 * Default value - `500`
 * @see [fixedWidthLineBreaks]
 * @see [columnMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphLayoutLineWrapper%23fixedWidth">Online Documentation</a>
 */
open var fixedWidth: Double
/**
 * Gets or sets whether the algorithm should use the [fixed width][fixedWidth] or [target aspect ratio][targetRatio] to determine line breaks.
 * 
 * Default value - `false`. The target aspect ratio defines how the line width is chosen.
 * @see [fixedWidth]
 * @see [targetRatio]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphLayoutLineWrapper%23fixedWidthLineBreaks">Online Documentation</a>
 */
open var fixedWidthLineBreaks: Boolean
/**
 * Gets or sets whether or not every other line is mirrored.
 * 
 * Default value - `true`. Every other line is mirrored.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphLayoutLineWrapper%23mirror">Online Documentation</a>
 */
open var mirror: Boolean
/**
 * Gets or sets the space between adjacent lines of the wrapped graph layout.
 * 
 * Default value - `10`
 * @throws ArgumentError if the spacing is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphLayoutLineWrapper%23spacing">Online Documentation</a>
 */
open var spacing: Double
/**
 * Gets or sets the desired target aspect ratio for the layout.
 * 
 * Default value - `1`
 * @throws ArgumentError if the target ratio is `0` or less
 * @see [fixedWidthLineBreaks]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphLayoutLineWrapper%23targetRatio">Online Documentation</a>
 */
open var targetRatio: Double
/**
 * Cuts the layout resulting from the [core layout algorithm][LayoutStageBase.coreLayout] at a specified width/height and shifts the remaining graph into the next row/column until the layout has the desired width/height.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphLayoutLineWrapper%23GraphLayoutLineWrapper-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<GraphLayoutLineWrapper> {
}
}

inline fun GraphLayoutLineWrapper(
    block: GraphLayoutLineWrapper.() -> Unit
): GraphLayoutLineWrapper {
    return GraphLayoutLineWrapper()
        .apply(block)
}
