// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Enumeration used by [BridgeManager] that determines how crossings between obstacles and paths are determined.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeCrossingPolicy">Online Documentation</a>
 */
external sealed class BridgeCrossingPolicy: YEnum<BridgeCrossingPolicy> {
   companion object: EnumMetadata<BridgeCrossingPolicy> {
       /**
 * Makes horizontal segments bridge over vertical obstacles.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeCrossingPolicy%23HORIZONTAL_BRIDGES_VERTICAL">Online Documentation</a>
 */
val HORIZONTAL_BRIDGES_VERTICAL: BridgeCrossingPolicy

/**
 * Makes vertical segments bridge over horizontal obstacles.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeCrossingPolicy%23VERTICAL_BRIDGES_HORIZONTAL">Online Documentation</a>
 */
val VERTICAL_BRIDGES_HORIZONTAL: BridgeCrossingPolicy

/**
 * Makes more horizontal edges bridge over edges which are less horizontal.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeCrossingPolicy%23MORE_HORIZONTAL_BRIDGES_LESS_HORIZONTAL">Online Documentation</a>
 */
val MORE_HORIZONTAL_BRIDGES_LESS_HORIZONTAL: BridgeCrossingPolicy

/**
 * Makes more vertical edges bridge over edges which are less vertical.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeCrossingPolicy%23MORE_VERTICAL_BRIDGES_LESS_VERTICAL">Online Documentation</a>
 */
val MORE_VERTICAL_BRIDGES_LESS_VERTICAL: BridgeCrossingPolicy
   }
}
