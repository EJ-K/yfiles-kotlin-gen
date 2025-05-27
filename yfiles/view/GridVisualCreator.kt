// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.ClassMetadata

/**
 * Renders a grid, using various different [styles][gridStyle] and [render technologies][renderMode].
 * @see [GridInfo]
 * @see [gridStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridVisualCreator">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [GridVisualCreator] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridVisualCreator%23GridVisualCreator-constructor-GridVisualCreator()">Online Documentation</a>
 */
external open class GridVisualCreator  () : IVisualCreator {
/**
 * Initializes a new instance of the [GridVisualCreator] class.
 * @param [gridInfo] The grid info.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridVisualCreator%23GridVisualCreator-constructor-GridVisualCreator(GridInfo)">Online Documentation</a>
 */
 constructor( gridInfo: GridInfo )
/**
 * Initializes a new instance of the [GridVisualCreator] class.
 * @param [horizontalSpacing] The x spacing.
 * @param [verticalSpacing] The y spacing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridVisualCreator%23GridVisualCreator-constructor-GridVisualCreator(number,number)">Online Documentation</a>
 */
 constructor( horizontalSpacing: Double ,
 verticalSpacing: Double )

/**
 * Gets or sets the grid info that describes the geometry of the grid.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridVisualCreator%23gridInfo">Online Documentation</a>
 */
final var gridInfo: GridInfo
/**
 * Gets or sets the grid style that this implementation uses.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridVisualCreator%23gridStyle">Online Documentation</a>
 */
final var gridStyle: GridStyle
/**
 * Gets or sets the mode used to render the grid.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridVisualCreator%23renderMode">Online Documentation</a>
 */
final var renderMode: RenderModes
/**
 * Gets or sets the [stroke] to use for painting the grid.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridVisualCreator%23stroke">Online Documentation</a>
 */
final var stroke: Stroke
/**
 * Gets or sets the visibility threshold.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridVisualCreator%23visibilityThreshold">Online Documentation</a>
 */
final var visibilityThreshold: Double
/**
 * Gets or sets a value indicating whether this [GridVisualCreator] is visible.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridVisualCreator%23visible">Online Documentation</a>
 */
final var visible: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridVisualCreator%23GridVisualCreator-method-createVisual">Online Documentation</a>
 */
 final override   fun createVisual( context: IRenderContext ):Visual?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridVisualCreator%23GridVisualCreator-method-updateVisual">Online Documentation</a>
 */
 final override   fun updateVisual( context: IRenderContext ,
 oldVisual: Visual? ):Visual?

companion object : ClassMetadata<GridVisualCreator> {
}
}
