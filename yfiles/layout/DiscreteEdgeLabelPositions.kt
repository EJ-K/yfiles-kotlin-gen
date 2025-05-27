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
 * @see [DiscreteEdgeLabelLayoutModel]
 * @see [DiscreteEdgeLabelLayoutModel.candidateMask]
 * @see [DiscreteEdgeLabelLayoutModel.getLabelPlacementForPosition]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelPositions">Online Documentation</a>
 */
external class DiscreteEdgeLabelPositions 
    private constructor(): YFlags<DiscreteEdgeLabelPositions> {
    companion object {
    /**
 * Position specifier that describes a label placement near the source, left/above the edge's path.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelPositions%23SOURCE_HEAD">Online Documentation</a>
 */
val SOURCE_HEAD: DiscreteEdgeLabelPositions
/**
 * Position specifier that describes a label placement near the middle of the edge, left/above the edge's path.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelPositions%23HEAD">Online Documentation</a>
 */
val HEAD: DiscreteEdgeLabelPositions
/**
 * Position specifier that describes a label placement near the target, left/above the edge's path.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelPositions%23TARGET_HEAD">Online Documentation</a>
 */
val TARGET_HEAD: DiscreteEdgeLabelPositions
/**
 * Position specifier that describes a label placement near the source, right/below the edge's path.
 * 
 * Value - `8`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelPositions%23SOURCE_TAIL">Online Documentation</a>
 */
val SOURCE_TAIL: DiscreteEdgeLabelPositions
/**
 * Position specifier that describes a label placement near the middle of the edge, right/below the edge's path.
 * 
 * Value - `16`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelPositions%23TAIL">Online Documentation</a>
 */
val TAIL: DiscreteEdgeLabelPositions
/**
 * Position mask that constrains the allowed positions to the two locations near the middle of the edge beside the edge's path.
 * 
 * Value - `18`
 * @see [HEAD]
 * @see [TAIL]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelPositions%23TWO_POS">Online Documentation</a>
 */
val TWO_POS: DiscreteEdgeLabelPositions
/**
 * Position specifier that describes a label placement near the target, right/below the edge's path.
 * 
 * Value - `32`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelPositions%23TARGET_TAIL">Online Documentation</a>
 */
val TARGET_TAIL: DiscreteEdgeLabelPositions
/**
 * Position mask that constrains the allowed positions to a set of six positions beside the edge path.
 * 
 * Value - `63`
 * @see [SOURCE_HEAD]
 * @see [SOURCE_TAIL]
 * @see [HEAD]
 * @see [TAIL]
 * @see [TARGET_HEAD]
 * @see [TARGET_TAIL]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelPositions%23SIX_POS">Online Documentation</a>
 */
val SIX_POS: DiscreteEdgeLabelPositions
/**
 * Position specifier that describes a label placement near the source, directly on the edge's path.
 * 
 * Value - `64`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelPositions%23SOURCE_CENTER">Online Documentation</a>
 */
val SOURCE_CENTER: DiscreteEdgeLabelPositions
/**
 * Position specifier that describes a label placement near the middle of the edge, directly on the edge's path.
 * 
 * Value - `128`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelPositions%23CENTER">Online Documentation</a>
 */
val CENTER: DiscreteEdgeLabelPositions
/**
 * Position mask that constrains the allowed positions to the [CENTER] of the edge's path.
 * 
 * Value - `128`
 * @see [CENTER]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelPositions%23CENTERED">Online Documentation</a>
 */
val CENTERED: DiscreteEdgeLabelPositions
/**
 * Position specifier that describes a label placement near the target, directly on the edge's path.
 * 
 * Value - `256`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelPositions%23TARGET_CENTER">Online Documentation</a>
 */
val TARGET_CENTER: DiscreteEdgeLabelPositions
/**
 * Position mask that constrains the allowed positions to a set of three positions directly on the edge's path.
 * 
 * Value - `448`
 * @see [SOURCE_CENTER]
 * @see [CENTER]
 * @see [TARGET_CENTER]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteEdgeLabelPositions%23THREE_CENTER">Online Documentation</a>
 */
val THREE_CENTER: DiscreteEdgeLabelPositions

    }
}
