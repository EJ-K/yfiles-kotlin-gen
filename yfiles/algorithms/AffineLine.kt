// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This class represents a line in the 2D-dimensional affine space.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AffineLine">Online Documentation</a>
 * 
 * @constructor Creates an affine line which is defined by a point and a vector.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AffineLine%23AffineLine-constructor-AffineLine(YPoint,YVector)">Online Documentation</a>
 */
external open class AffineLine  ( p1: YPoint ,
 v: YVector ) : YObject {
/**
 * Creates an affine line which is defined by two points.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AffineLine%23AffineLine-constructor-AffineLine(YPoint,YPoint)">Online Documentation</a>
 */
 constructor( p1: YPoint ,
 p2: YPoint )

/**
 * Gets a from ax+by+c = 0
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AffineLine%23a">Online Documentation</a>
 */
open val a: Double
/**
 * Gets b from ax+by+c = 0
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AffineLine%23b">Online Documentation</a>
 */
open val b: Double
/**
 * Gets c from ax+by+c = 0
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AffineLine%23c">Online Documentation</a>
 */
open val c: Double
/**
 * Projects an point on the line in direction of the X-axis.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AffineLine%23AffineLine-method-getXProjection">Online Documentation</a>
 */
 open   fun getXProjection( p: YPoint ):YPoint?
/**
 * Projects an point on the line in direction of the Y-axis.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AffineLine%23AffineLine-method-getYProjection">Online Documentation</a>
 */
 open   fun getYProjection( p: YPoint ):YPoint?

companion object : ClassMetadata<AffineLine> {
/**
 * Returns the crossing of two lines.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AffineLine%23AffineLine-method-getCrossing">Online Documentation</a>
 */
 final   fun getCrossing( l1: AffineLine ,
 l2: AffineLine ):YPoint?
}
}
