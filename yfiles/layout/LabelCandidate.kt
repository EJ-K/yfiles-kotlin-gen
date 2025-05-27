// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.IPlaneObject
import yfiles.algorithms.YDimension
import yfiles.algorithms.YOrientedRectangle
import yfiles.algorithms.YPoint
import yfiles.algorithms.YRectangle
import yfiles.graph.ILabelModelParameter
import yfiles.lang.ClassMetadata

/**
 * A [LabelCandidate] describes one valid placement for a label considering the label model.
 * @see [INodeLabelLayoutModel]
 * @see [IEdgeLabelLayoutModel]
 * @see [GenericLabeling][yfiles.labeling.GenericLabeling]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidate">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [LabelCandidate] described by location, size, model parameter and internal flag.
 * @param [pos] the location of the upper left corner of the candidate
 * @param [size] the size of the candidate
 * @param [param] the parameters of the label model associated with this candidate
 * @param [owner] the label associated with the candidate
 * @param [internal] `true` if the candidate is allowed to overlap with its owner, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidate%23LabelCandidate-constructor-LabelCandidate(YPoint,YDimension,Object,ILabelLayout,boolean)">Online Documentation</a>
 * 
 * @property size
 * Gets the width and height of the candidate's bounds.
 * @see [boundingBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidate%23size">Online Documentation</a>
 * 
 * @property owner
 * Gets the [ILabelLayout] for which this candidate was created.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidate%23owner">Online Documentation</a>
 * 
 * @property internal
 * Gets whether or not this candidate describes an internal label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidate%23internal">Online Documentation</a>
 */
external open class LabelCandidate  (
 pos: YPoint ,
open val size: YDimension,
 param: ILabelModelParameter ,
open val owner: ILabelLayout,
open val internal: Boolean = definedExternally) : IPlaneObject {
/**
 * Creates a new instance of [LabelCandidate] described by its box, model parameter and internal flag.
 * @param [labelBox] the box that specifies the candidate's size and position
 * @param [param] the parameters of the label model associated with this candidate
 * @param [owner] the label associated with the candidate
 * @param [internal] `true` if the candidate is allowed to overlap with its owner, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidate%23LabelCandidate-constructor-LabelCandidate(YOrientedRectangle,Object,ILabelLayout,boolean)">Online Documentation</a>
 */
 constructor( labelBox: YOrientedRectangle ,
 param: ILabelModelParameter ,
 owner: ILabelLayout ,
 internal: Boolean  = definedExternally)

/**
 * Gets the bounding box of this candidate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidate%23boundingBox">Online Documentation</a>
 */
override val boundingBox: YRectangle
/**
 * Gets the oriented box of this candidate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidate%23box">Online Documentation</a>
 */
open val box: YOrientedRectangle
/**
 * Gets or sets the custom profit for this candidate.
 * 
 * Default value - `0`
 * @throws ArgumentError if the specified value lies outside of `[0,1]`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidate%23customProfit">Online Documentation</a>
 */
open var customProfit: Double
/**
 * Gets or sets a penalty for a candidate position that overlaps the path of an edge.
 * 
 * Default value - `1`
 * @throws ArgumentError if the specified penalty is outside `[0,1]`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidate%23edgeOverlapPenalty">Online Documentation</a>
 */
open var edgeOverlapPenalty: Double
/**
 * Gets the height of the candidate's bounding box.
 * @see [size]
 * @see [boundingBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidate%23height">Online Documentation</a>
 */
open val height: Double
/**
 * Gets the coordinates of the upper-left corner of the candidate's bounds.
 * @see [boundingBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidate%23location">Online Documentation</a>
 */
open val location: YPoint
/**
 * Gets the model parameter that was used by the underlying model to generate this label candidate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidate%23modelParameter">Online Documentation</a>
 */
open val modelParameter: ILabelModelParameter
/**
 * Gets or sets a penalty for a candidate position that overlaps the box of a node.
 * 
 * Default value - `1`
 * @throws ArgumentError if the specified penalty is outside `[0,1]`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidate%23nodeOverlapPenalty">Online Documentation</a>
 */
open var nodeOverlapPenalty: Double
/**
 * Gets the sum of node overlap penalty and edge overlap penalty.
 * @see [edgeOverlapPenalty]
 * @see [nodeOverlapPenalty]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidate%23overlapPenalty">Online Documentation</a>
 */
open val overlapPenalty: Double
/**
 * Gets whether or not this candidate's box had already been chosen by the labeling algorithm.
 * @see [propagate]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidate%23propagated">Online Documentation</a>
 */
open val propagated: Boolean
/**
 * Gets the width of the candidate's bounds.
 * @see [size]
 * @see [boundingBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidate%23width">Online Documentation</a>
 */
open val width: Double
/**
 * Gets the minimum x-coordinate of the candidate's bounds.
 * @see [location]
 * @see [boundingBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidate%23x">Online Documentation</a>
 */
open val x: Double
/**
 * Gets the minimum y-coordinate of the candidate's bounds.
 * @see [location]
 * @see [boundingBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidate%23y">Online Documentation</a>
 */
open val y: Double
/**
 * Replaces the model parameter and box of the owner with the model parameter and box of this candidate.
 * @see [owner]
 * @see [modelParameter]
 * @see [box]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidate%23LabelCandidate-method-propagate">Online Documentation</a>
 */
 open   fun propagate()

companion object : ClassMetadata<LabelCandidate> {
}
}
