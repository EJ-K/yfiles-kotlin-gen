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
import yfiles.lang.YObject

/**
 * A [SwimlaneRepresentative] represents the position and arrangement mode for a swimlane.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SwimlaneRepresentative">Online Documentation</a>
 * 
 * @constructor Creates a new [SwimlaneRepresentative] instance.
 * @param [swimlanePos] denotes the current position of the represented swimlane
 * @param [allowRearrangement] `true` if the represented swimlane may be [rearranged][allowRearrangement], `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SwimlaneRepresentative%23SwimlaneRepresentative-constructor-SwimlaneRepresentative">Online Documentation</a>
 * 
 * @property swimlanePos
 * Gets or sets the current position of the represented swimlane.
 * @throws ArgumentError if the position is smaller than `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SwimlaneRepresentative%23swimlanePos">Online Documentation</a>
 * 
 * @property allowRearrangement
 * Gets or sets whether or not the represented swimlane can be rearranged.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SwimlaneRepresentative%23allowRearrangement">Online Documentation</a>
 */
external open class SwimlaneRepresentative  (
open var swimlanePos: Int,
open var allowRearrangement: Boolean) : YObject {

companion object : ClassMetadata<SwimlaneRepresentative> {
}
}
