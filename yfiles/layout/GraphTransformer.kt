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
 * This layout algorithm applies geometric transformations to (sub-)graphs.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphTransformer">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [GraphTransformer] with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphTransformer%23GraphTransformer-constructor-GraphTransformer">Online Documentation</a>
 */
external open class GraphTransformer  () : MultiStageLayout, ILayoutStage {

/**
 * Gets or sets whether or not to automatically choose the best fitting rotation angle.
 * 
 * Default value - `false`. The layout is rotated by a specific angle.
 * @see [operation]
 * @see [OperationType.ROTATE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphTransformer%23bestFitRotationEnabled">Online Documentation</a>
 */
open var bestFitRotationEnabled: Boolean
/**
 * Gets or sets the core layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphTransformer%23coreLayout">Online Documentation</a>
 */
override var coreLayout: ILayoutAlgorithm?
/**
 * Gets or sets the transformation operation.
 * 
 * Default value - [OperationType.SCALE]
 * @throws ArgumentError if the specified operation is unknown
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphTransformer%23operation">Online Documentation</a>
 */
open var operation: OperationType
/**
 * Gets or sets the preferred height of the layout.
 * 
 * Default value - `1.0`
 * @throws ArgumentError if the specified height is negative
 * @see [preferredWidth]
 * @see [bestFitRotationEnabled]
 * @see [operation]
 * @see [OperationType.ROTATE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphTransformer%23preferredHeight">Online Documentation</a>
 */
open var preferredHeight: Double
/**
 * Gets or sets the preferred width of the layout.
 * 
 * Default value - `1.41`
 * @throws ArgumentError if the specified width is negative
 * @see [preferredHeight]
 * @see [bestFitRotationEnabled]
 * @see [operation]
 * @see [OperationType.ROTATE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphTransformer%23preferredWidth">Online Documentation</a>
 */
open var preferredWidth: Double
/**
 * Gets or sets the angle of rotation.
 * 
 * Default value - `0.0`
 * @see [operation]
 * @see [OperationType.ROTATE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphTransformer%23rotationAngle">Online Documentation</a>
 */
open var rotationAngle: Double
/**
 * Sets the uniform scaling factor used for the [scale operation][OperationType.SCALE].
 * @throws ArgumentError if the specified scaling factor is negative or `0`
 * @see [scaleFactorX]
 * @see [scaleFactorY]
 * @see [operation]
 * @see [OperationType.SCALE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphTransformer%23scaleFactor">Online Documentation</a>
 */
open var scaleFactor: Double
@Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
get
/**
 * Gets or sets the horizontal scaling factor used for the [scale operation][OperationType.SCALE].
 * 
 * Default value - `1.0`
 * @throws ArgumentError if the specified scaling factor is negative or `0`
 * @see [scaleFactorY]
 * @see [operation]
 * @see [OperationType.SCALE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphTransformer%23scaleFactorX">Online Documentation</a>
 */
open var scaleFactorX: Double
/**
 * Gets or sets the vertical scaling factor used for the [scale operation][OperationType.SCALE].
 * 
 * Default value - `1.0`
 * @throws ArgumentError if the specified scaling factor is negative or `0`
 * @see [scaleFactorX]
 * @see [operation]
 * @see [OperationType.SCALE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphTransformer%23scaleFactorY">Online Documentation</a>
 */
open var scaleFactorY: Double
/**
 * Gets or sets whether or not to also scale node sizes when performing the [scale operation][OperationType.SCALE].
 * 
 * Default value - `false`. Nodes keep their sizes when the layout is scaled.
 * @see [operation]
 * @see [OperationType.SCALE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphTransformer%23scaleNodeSize">Online Documentation</a>
 */
open var scaleNodeSize: Boolean
/**
 * Gets or sets the horizontal translation distance.
 * 
 * Default value - `0.0`
 * @see [translateY]
 * @see [operation]
 * @see [OperationType.TRANSLATE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphTransformer%23translateX">Online Documentation</a>
 */
open var translateX: Double
/**
 * Gets or sets the vertical translation distance.
 * 
 * Default value - `0.0`
 * @see [translateX]
 * @see [operation]
 * @see [OperationType.TRANSLATE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphTransformer%23translateY">Online Documentation</a>
 */
open var translateY: Double
/**
 * Applies the selected transformation to the given graph after invoking the optional [core layout algorithm][coreLayout].
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphTransformer%23GraphTransformer-method-applyLayoutCore">Online Documentation</a>
 */
 override   fun applyLayoutCore( graph: LayoutGraph )
/**
 * Specifies the preferred size of the layout.
 * @param [width] the preferred width of the layout
 * @param [height] the preferred height of the layout
 * @throws ArgumentError if the specified width or height is negative
 * @see [preferredWidth]
 * @see [preferredHeight]
 * @see [bestFitRotationEnabled]
 * @see [operation]
 * @see [OperationType.ROTATE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphTransformer%23GraphTransformer-method-preferredLayoutSize">Online Documentation</a>
 */
 open   fun preferredLayoutSize( width: Double ,
 height: Double )
/**
 * Specifies the horizontal and vertical scaling factor used for the [scale operation][OperationType.SCALE].
 * @param [xFactor] the horizontal scaling factor
 * @param [yFactor] the vertical scaling factor
 * @throws ArgumentError if one the specified scaling factors is negative or `0`
 * @see [scaleFactorX]
 * @see [scaleFactorY]
 * @see [operation]
 * @see [OperationType.SCALE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphTransformer%23GraphTransformer-method-setScaleFactors">Online Documentation</a>
 */
 open   fun setScaleFactors( xFactor: Double ,
 yFactor: Double )

companion object : ClassMetadata<GraphTransformer> {
/**
 * Rotates the given graph so its resulting bounding box fits best to the given bounds.
 * @receiver the graph that is rotated
 * @param [width] the width of the preferred layout bounds
 * @param [height] the height of the preferred layout bounds
 * @return the rotation angle
 * @see [bestFitRotationEnabled]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphTransformer%23GraphTransformer-method-applyBestFitRotationAngle">Online Documentation</a>
 */
 final   fun LayoutGraph.applyBestFitRotationAngle( width: Double ,
 height: Double ):Double
/**
 * Returns the rotation angle for the graph that will result in a layout that fits best to the given bounds.
 * @receiver the graph that is rotated
 * @param [width] the width of the preferred layout bounds
 * @param [height] the height of the preferred layout bounds
 * @return the rotation angle
 * @see [applyBestFitRotationAngle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphTransformer%23GraphTransformer-method-findBestFitRotationAngle">Online Documentation</a>
 */
 final   fun LayoutGraph.findBestFitRotationAngle( width: Double ,
 height: Double ):Double
/**
 * Fits the given graph into the specified rectangular bounds.
 * @receiver the graph to modify
 * @param [x] the upper left x-coordinate of the bounds
 * @param [y] the upper left y-coordinate of the bounds
 * @param [w] the width of the bounds
 * @param [h] the height of the bounds
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphTransformer%23GraphTransformer-method-setMaximalBounds">Online Documentation</a>
 */
 final   fun LayoutGraph.setMaximalBounds( x: Double ,
 y: Double ,
 w: Double ,
 h: Double )
/**
 * Translates the layout coordinates by the given vector.
 * @receiver the graph that is translated
 * @param [dx] the horizontal distance the given graph is moved
 * @param [dy] the vertical distance the given graph is moved
 * @see [OperationType.TRANSLATE]
 * @see [operation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphTransformer%23GraphTransformer-method-translate">Online Documentation</a>
 */
 final   fun LayoutGraph.translate( dx: Double ,
 dy: Double )
}
}

inline fun GraphTransformer(
    block: GraphTransformer.() -> Unit
): GraphTransformer {
    return GraphTransformer()
        .apply(block)
}
