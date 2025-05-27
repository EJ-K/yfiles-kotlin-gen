// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.YDimension
import yfiles.algorithms.YInsets
import yfiles.algorithms.YPoint
import yfiles.lang.ClassMetadata

/**
 * [OrientationLayout] is a [ILayoutStage] that changes the orientation of the layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientationLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [OrientationLayout] instance using the given [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [coreLayout] the core layout routine
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientationLayout%23OrientationLayout-constructor-OrientationLayout(ILayoutAlgorithm)">Online Documentation</a>
 */
external open class OrientationLayout  ( coreLayout: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {
/**
 * Creates a new [OrientationLayout] instance using the given orientation.
 * @param [orientation] the orientation specifier
 * @see [orientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientationLayout%23OrientationLayout-constructor-OrientationLayout(LayoutOrientation)">Online Documentation</a>
 */
 constructor( orientation: LayoutOrientation )

/**
 * Gets or sets whether or not the position of the edge labels should be changed during orientation change.
 * 
 * Default value - `true`. The orientation of labels is handled by this [OrientationLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientationLayout%23considerEdgeLabels">Online Documentation</a>
 */
open var considerEdgeLabels: Boolean
/**
 * Gets whether or not the current orientation is horizontal.
 * @see [orientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientationLayout%23horizontalOrientation">Online Documentation</a>
 */
open val horizontalOrientation: Boolean
/**
 * Gets or sets the mirror mask that defines which orientations this [OrientationLayout] shall mirror.
 * 
 * Default value - [MirrorModes.BOTTOM_TO_TOP]
 * @throws ArgumentError if an unknown mask is specified
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientationLayout%23mirrorMode">Online Documentation</a>
 */
open var mirrorMode: MirrorModes
/**
 * Gets or sets the main direction of the layout.
 * 
 * Default value - [LayoutOrientation.TOP_TO_BOTTOM]
 * @throws ArgumentError if the specified orientation is unknown
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientationLayout%23orientation">Online Documentation</a>
 */
open var orientation: LayoutOrientation
/**
 * Prepares the graph for orientation change before calling the [core layout algorithm][LayoutStageBase.coreLayout] and finishes the orientation change afterwards.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientationLayout%23OrientationLayout-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Applies the desired orientation to the graph.
 * @param [graph] the input graph
 * @see [prepareOrientationChange]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientationLayout%23OrientationLayout-method-completeOrientationChange">Online Documentation</a>
 */
 open protected   fun completeOrientationChange( graph: LayoutGraph )
/**
 * Transforms the given point during completion.
 * @param [point] the calculated point
 * @return the transformed point
 * @see [completeOrientationChange]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientationLayout%23OrientationLayout-method-completeTransform">Online Documentation</a>
 */
 open protected   fun completeTransform( point: YPoint ):YPoint
/**
 * Creates [YInsets] that are a geometric transformation of the given [YInsets].
 * @param [insets] the original insets
 * @return the oriented insets
 * @see [orientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientationLayout%23OrientationLayout-method-createOrientedInsets">Online Documentation</a>
 */
 open   fun createOrientedInsets( insets: YInsets ):YInsets
/**
 * Creates a [NodeHalo] that is a geometric transformation of the given [NodeHalo].
 * @param [halo] the original [NodeHalo]
 * @return the oriented [NodeHalo]
 * @see [orientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientationLayout%23OrientationLayout-method-createOrientedNodeHalo">Online Documentation</a>
 */
 open   fun createOrientedNodeHalo( halo: NodeHalo ):NodeHalo
/**
 * Creates a [YDimension] that is a geometric transformation of the given size.
 * @param [nodeSize] the original node size
 * @return the oriented node size
 * @see [orientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientationLayout%23OrientationLayout-method-createOrientedNodeSize">Online Documentation</a>
 */
 open   fun createOrientedNodeSize( nodeSize: YDimension ):YDimension
/**
 * Returns whether or not this [OrientationLayout] instance will mirror the graph for a given layout orientation.
 * @param [orientation] the layout orientation for which to check the mirror state
 * @return `true` if the layout algorithm will mirror the graph at the corresponding axis for the given layout orientation, `false` otherwise
 * @see [orientation]
 * @see [mirrorMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientationLayout%23OrientationLayout-method-isOrientationMirrored">Online Documentation</a>
 */
 open   fun isOrientationMirrored( orientation: LayoutOrientation ):Boolean
/**
 * Prepares the layout for the desired orientation.
 * @param [graph] the input graph
 * @see [completeOrientationChange]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientationLayout%23OrientationLayout-method-prepareOrientationChange">Online Documentation</a>
 */
 open protected   fun prepareOrientationChange( graph: LayoutGraph )
/**
 * Transforms the given point during preparation.
 * @param [point] the original point
 * @return the transformed point
 * @see [prepareOrientationChange]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientationLayout%23OrientationLayout-method-prepareTransform">Online Documentation</a>
 */
 open protected   fun prepareTransform( point: YPoint ):YPoint
/**
 * Transforms the given point during the preparation or completion step.
 * @param [point] the original/calculated point
 * @param [prepare] `true` if this method is called during preparation, `false` if it is called during completion
 * @return the transformed point
 * @see [prepareOrientationChange]
 * @see [completeOrientationChange]
 * @see [prepareTransform]
 * @see [completeTransform]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientationLayout%23OrientationLayout-method-transform">Online Documentation</a>
 */
 open protected   fun transform( point: YPoint ,
 prepare: Boolean ):YPoint

companion object : ClassMetadata<OrientationLayout> {
}
}
